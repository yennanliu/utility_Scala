package AkkaDemo4SparkMasterWorker.worker

import java.util.UUID

import akka.actor.{Actor, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import AkkaDemo4SparkMasterWorker.common.{HeartBeat, RegisterWorkerInfo, SendHeartBeat}

import scala.concurrent.duration._

// https://www.bilibili.com/video/BV12N411R726?p=246&spm_id_from=pageDriver
// https://www.bilibili.com/video/BV12N411R726?p=247
// https://www.bilibili.com/video/BV12N411R726?p=249

/**
 *   Spark Worker
 *   - code for worker node
 */

object SparkWorker {

  def main(args: Array[String]): Unit = {

    //--------------------------
    // parameterize the args
    //    if (args.length != 6){
    //      println("plz insert : workerHost, workerPort, workerName, masterHost, masterPort, masterName")
    //      sys.exit()
    //    }
    //
    //    val workerHost = args(0)
    //    val workerPort = args(1)
    //    val workerName = args(2)
    //    val masterHost = args(3)
    //    val masterPort = args(4)
    //    val masterName = args(5)
    //--------------------------

    // create Actor system
    val workerHost = "127.0.0.1" // serer ip
    val workerPort = 10001
    val workerName = "SparkWorker01"
    val masterHost = "127.0.0.1"
    val masterPort = 10005
    val masterName = "SparkMaster01"

    // create config, includes protocol, ip, and port
    val config = ConfigFactory.parseString(
      s"""
         | akka.actor.provider="akka.remote.RemoteActorRefProvider"
         | akka.remote.netty.tcp.hostname=$workerHost
         | akka.remote.netty.tcp.port=$workerPort
         |""".stripMargin
    )

    // create Actor System
    val sparkWorkerSystem =  ActorSystem("SparkWorker", config)

    // create SparkWorker actor ref
    val sparkWorkerRef =  sparkWorkerSystem.actorOf(Props(new SparkWorker(masterHost, masterPort, masterName)), s"$workerName")

    // launch SparkWorker
    sparkWorkerRef ! "start"
  }

class SparkWorker(masterHost:String, masterPort:Int, masterName:String) extends Actor {

  // masterProxy is "Master Actor's ref"
  var masterProxy : ActorSelection = _

  val id = UUID.randomUUID().toString

  // init master actor ref (masterProxy)
  override def preStart(): Unit = {
    println("preStart run ...")
    masterProxy = context.actorSelection(s"akka.tcp://SparkMaster@127.0.0.1:10005/user/$masterName")
    println("masterProxy = " + masterProxy)
  }

  override def receive: Receive = {

    case "start" => {
      println("SparkWorker is running ...")
      // send a register msg
      masterProxy ! RegisterWorkerInfo(id, 16, 16 * 1024)
      println("RegisterWorkerInfo sent ...")
    }

    case RegisterWorkerInfo => {
      println("workerid = " + id + " register success !")

      // define a TIMER after register success
      // that send a msg during every few second
      import context.dispatcher
      // 0 millis : runs timer right now ( 1: delay 1 sec)
      // 3000 millis : runs every 3 sec
      // self : send to itself
      // sendHeartBeat : sent content
      context.system.scheduler.schedule(0 millis, 3000 millis, self, SendHeartBeat) // remember to import scala.concurrent.duration._
    }

    case SendHeartBeat => {
      // if SendHeartBeat, then send heartbeat to master
      println("worker = " + id + " send heartbeat to master !")
      masterProxy ! HeartBeat(id)
      }
    }
  }
}

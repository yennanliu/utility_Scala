package AkkaDemo4SparkMasterWorker.worker

import java.util.UUID

import akka.actor.{Actor, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import AkkaDemo4SparkMasterWorker.common.{HeartBeat, RegisterWorkerInfo, SendHeartBeat}

import scala.concurrent.duration._

// https://www.bilibili.com/video/BV12N411R726?p=246&spm_id_from=pageDriver
// https://www.bilibili.com/video/BV12N411R726?p=247

class SparkWorker(masterHost:String, masterPort:Int) extends Actor {

  // masterProxy is "Master Actor's ref"
  var masterProxy : ActorSelection = _

  val id = UUID.randomUUID().toString

  // init master actor ref (masterProxy)
  override def preStart(): Unit = {
    println("preStart run ...")
    masterProxy = context.actorSelection(s"akka.tcp://SparkMaster@127.0.0.1:10005/user/SparkMaster01")
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
      // if SendHeartBeat, then send heart beat to master
      println("worker = " + id + " send hear beat to master !")
      masterProxy ! HeartBeat(id)
    }
  }
}

object SparkWorker {

  def main(args: Array[String]): Unit = {

    // create Actor system
    val workerHost = "127.0.0.1" // serer ip
    val workerPort = 10001
    val masterHost = "127.0.0.1"
    val masterPort = 10005

    // create config, includes protocol, ip, and port
    val config = ConfigFactory.parseString(
      s"""
         | akka.actor.provider="akka.remote.RemoteActorRefProvider"
         | akka.remote.netty.tcp.hostname=127.0.0.1
         | akka.remote.netty.tcp.port=10002
         |""".stripMargin
    )

    // create Actor System
    val sparkWorkerSystem =  ActorSystem("SparkWorker", config)

    // create SparkWorker actor ref
    val sparkWorkerRef =  sparkWorkerSystem.actorOf(Props(new SparkWorker(masterHost, masterPort)), "SparkWorker01")

    // launch SparkWorker
    sparkWorkerRef ! "start"
  }
}

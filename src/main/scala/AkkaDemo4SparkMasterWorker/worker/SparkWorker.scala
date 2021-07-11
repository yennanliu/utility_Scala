package AkkaDemo4SparkMasterWorker.worker

import java.util.UUID

import akka.actor.{Actor, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

import AkkaDemo4SparkMasterWorker.common.RegisterWorkerInfo

// https://www.bilibili.com/video/BV12N411R726?p=246&spm_id_from=pageDriver

class SparkWorker(masterHost:String, masterPort:Int) extends Actor {

  // masterProxy is "Master Actor's ref"
  var masterProxy : ActorSelection = _

  val id = UUID.randomUUID().toString

  // init master actor ref (masterProxy)
  override def preStart(): Unit = {
    masterProxy = context.actorSelection(s"akka.tcp://SparkMaster@${masterHost}:${masterPort}/user/SparkMaster01")
    println("masterProxy = " + masterProxy)
  }

  override def receive: Receive = {
    case "start" => {
      println("SparkWorker is running ...")
      // send a register msg
      masterProxy ! RegisterWorkerInfo(id, 16, 16 * 1024)
    }

    case RegisterWorkerInfo => {
      println("workerid = " + id + " register success !")
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
         | akka.remote.netty.tcp.hostname=$workerHost
         | akka.remote.netty.tcp.port=$workerPort
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

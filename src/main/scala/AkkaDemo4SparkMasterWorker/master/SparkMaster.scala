package AkkaDemo4SparkMasterWorker.master

import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

// https://www.bilibili.com/video/BV12N411R726?p=246&spm_id_from=pageDriver

class SparkMaster extends Actor {
  override def receive: Receive = {
    case "start" => println("Spark master is running ...")
  }
}

object SparkMaster {
  def main(args: Array[String]): Unit = {

    // create Actor system
    val host = "127.0.0.1" // serer ip
    val port = 10005

    // create config, includes protocol, ip, and port
    val config = ConfigFactory.parseString(
      s"""
         | akka.actor.provider="akka.remote.RemoteActorRefProvider"
         | akka.remote.netty.tcp.hostname=$host
         | akka.remote.netty.tcp.port=$port
         |""".stripMargin
    )

    val sparkMasterSystem =  ActorSystem("SparkMaster", config)

    // create sparkMasterSystem actor
    val sparkMasterRef =  sparkMasterSystem.actorOf(Props[SparkMaster], "SparkMaster")

    // lunch SparkMaster
    sparkMasterRef ! "start"

  }
}

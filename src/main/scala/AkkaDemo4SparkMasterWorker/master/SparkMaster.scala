package AkkaDemo4SparkMasterWorker.master

import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import AkkaDemo4SparkMasterWorker.common.{HeartBeat, RegisterWorkerInfo, WorkerInfo}

import scala.collection.mutable

// https://www.bilibili.com/video/BV12N411R726?p=246&spm_id_from=pageDriver
// https://www.bilibili.com/video/BV12N411R726?p=247

/**
 *   Spark Master
 *   - code for master node
 */

class SparkMaster extends Actor {
  // define a hashmap for worker management
  val workers = mutable.Map[String, WorkerInfo]()

  override def receive: Receive = {

    case "start" => println("Spark master is running ...")

    case RegisterWorkerInfo(id, cpu, ram) => {

      // receive worker (client)'s register msg
      if (! workers.contains(id)){ // if there is NO is saved in the hashmap, NOTE : "! workers.contains(id)" condition

        // create WorkInfo instance
        val workerInfo = new WorkerInfo(id, cpu, ram)

        // put into hashmap (RegisterWorkerInfo)
        workers += ((id, workerInfo))  // NOTE the format : ((id, workerInfo))
        println("Registered worker : " + workers)
        println("# of Registered worker : " + workers.toList.length)

        // reply worker
        sender() ! RegisterWorkerInfo
      }
    }
    // if master receiver heart beat
    case HeartBeat(id) => {
      // update worker's heart beat time
      // 1. get workerInfo from workers (hashmap)
      val workerInfo: WorkerInfo = workers(id)
      workerInfo.lastHeartBeat = System.currentTimeMillis()
      println("master updates worker = " + id + " heartbeat !")

    }
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

    // create SparkMaster actor ref
    val sparkMasterRef =  sparkMasterSystem.actorOf(Props[SparkMaster], "SparkMaster01")

    // lunch SparkMaster actor
    sparkMasterRef ! "start"
  }
}

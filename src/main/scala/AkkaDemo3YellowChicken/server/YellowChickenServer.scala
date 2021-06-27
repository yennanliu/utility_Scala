package AkkaDemo3YellowChicken.server

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

// https://www.bilibili.com/video/BV12N411R726?p=242
// https://github.com/yennanliu/utility_Scala/blob/master/doc/pic/AkkaDemo3.png

// entry point (main program)
object YellowChickenServer extends App {

  val host = "127.0.0.1" // serer ip
  val port = 9999

  // create config, includes protocol, ip, and port
  val config = ConfigFactory.parseString(
    s"""
      | akka.actor.provider="akka.remote.RemoteActorRefProvider"
      | akka.remote.netty.tcp.hostname=$host
      | akka.remote.netty.tcp.port=$port
      |""".stripMargin
  )

  // create ActorSystem
  // url
  // actor name : server
  //val serverActorSystem = ActorSystem("server")   //<-- for local
  val serverActorSystem = ActorSystem("server", config)     //<-- for runs on internet (server)

  // create YellowChickenServer 's actor and return actorRef
  // Props[YellowChickenServer] : Reflection : https://www.sczyh30.com/posts/Java/java-reflection-1/
  // actor system name : YellowChickenServer
  val YellowChickenServerRef:ActorRef =  serverActorSystem.actorOf(Props[YellowChickenServer], "YellowChickenServer")

  // run
  YellowChickenServerRef ! "start"
}

class YellowChickenServer extends Actor {
  override def receive: Receive = {
    case "start" => println("YellowChickenServer start ...")
  }
}
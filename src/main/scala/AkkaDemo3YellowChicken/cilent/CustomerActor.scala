package AkkaDemo3YellowChicken.cilent

import akka.actor.{Actor, ActorSelection, ActorSystem}
import com.typesafe.config.ConfigFactory

// https://www.bilibili.com/video/BV12N411R726?p=243&spm_id_from=pageDriver

// entry point (main program)
object CustomerActor extends App {

  val (clientHost, clientPort, serverHost, serverPort) = ("127.0.0.1", 9999, "127.0.0.1", 9999)

  // create config, includes protocol, ip, and port
  val config = ConfigFactory.parseString(
    s"""
       | akka.actor.provider="akka.remote.RemoteActorRefProvider"
       | akka.remote.netty.tcp.hostname=$clientHost
       | akka.remote.netty.tcp.port=$clientPort
       |""".stripMargin
  )

  // create ActorSystem
  private val clientActorSystem = ActorSystem("client", config)

  // create CustomerActor's instance and reference

}

class CustomerActor(serverHost: String, serverPort: Int) extends Actor {

  /** define YellowChickenServerRef */
  var serverActorRef : ActorSelection = _

  /**
   * PreStart
   * in Actor, we have a method : PreStart that will pre-run before Actor run
   * In Akka development, We usually do initial tasks in here (PreStart)
   */

  override def preStart(): Unit = {
    // get below server url from YellowChickenServer running (console)
    //serverActorRef = context.actorSelection("akka.tcp://server@127.0.0.1:9999")
    serverActorRef = context.actorSelection(s"akka.tcp://server@${serverHost}:${serverPort}/user/YellowChickenServer")
  }

  override def receive: Receive = ???
}



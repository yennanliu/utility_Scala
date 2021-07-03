package AkkaDemo3YellowChicken.cilent

import AkkaDemo3YellowChicken.common.{ClientMessage, ServerMessage}
import akka.actor.{Actor, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

import scala.io.StdIn

// https://www.bilibili.com/video/BV12N411R726?p=243&spm_id_from=pageDriver
// https://www.bilibili.com/video/BV12N411R726?p=244&spm_id_from=pageDriver

/**
 *  CustomerActor
 *
 *  1) client side main program
 *  2) CustomerActor
 */

// entry point (main program)
object CustomerActor extends App {

  val (clientHost, clientPort, serverHost, serverPort) = ("127.0.0.1", 9990, "127.0.0.1", 9999)

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
  val customerActorRef = clientActorSystem.actorOf(Props(new CustomerActor(serverHost, serverPort)), "customerActor")

  // run customerActorRef ( run the Actor)
  customerActorRef ! "start"

  // send more msg to server
  while (true){
    println("plz input your question ?")
    val mes = StdIn.readLine()
    customerActorRef ! mes
  }

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
    println("preStart start ....")

    // get below server url from YellowChickenServer running (console)
    //serverActorRef = context.actorSelection("akka.tcp://server@127.0.0.1:9999")
    serverActorRef = context.actorSelection(s"akka.tcp://server@${serverHost}:${serverPort}/user/YellowChickenServer")

    println("serverActorRef = " + serverActorRef)
  }

  override def receive: Receive = {
    case "start" => println("client start !!! ready to serve")
    case mes:String => {
      // send to server (YellowChickenServer)
      serverActorRef ! ClientMessage(mes)  // use ClientMessage's (case class) apply method. Case class implements apply method by default
    }
      // if receive reply from server
    case ServerMessage(mes) => {
        println(s"msg acknowledged! (from YellowChickenServer) :  $mes")
    }
  }
}



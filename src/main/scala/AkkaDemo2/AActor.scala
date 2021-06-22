package AkkaDemo2

import akka.actor.{Actor, ActorRef}

// https://www.bilibili.com/video/BV12N411R726?p=238

/** Actor A */

class AActor(actorRef: ActorRef) extends Actor{

  // BActorRef here, for sending msg to BActor
  val bActorRef: ActorRef = actorRef

  override def receive: Receive = {
    case "start" => {
      println("AActor start !!")
      self ! "fight" // send msg to itself ( AActor)
    }

    case "fight" => {
      // send msg to BActor
      // here we need to have BActor's ref, so we can send msg to it
      val msg = "AActor (Kyo) つおお....くらいやがれぇぇ!"
      bActorRef ! s"$msg fight"
    }
  }
}

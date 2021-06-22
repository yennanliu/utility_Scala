package AkkaDemo2

import akka.actor.{ActorRef, ActorSystem, Props}

// https://www.bilibili.com/video/BV12N411R726?p=238

/** Main Running App */

object app extends App {

  // create ActorSystem
  private val actorFactory = ActorSystem("actorFactory")

  // create BActor's reference
  val bActorRef:ActorRef =  actorFactory.actorOf(Props[BActor], "bActor")

  // create AActor's reference
  private val aActorRef:ActorRef =  actorFactory.actorOf(Props(new AActor(bActorRef)), "aActor")

  // AActor run
  aActorRef ! "fight"

}

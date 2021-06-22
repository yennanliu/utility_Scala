package AkkaDemo2

// https://www.bilibili.com/video/BV12N411R726?p=238

/** Actor B */

import akka.actor.Actor

class BActor extends Actor {
  override def receive: Receive = {
    case "fight" => {
      println("BActor (IorI) see this !!! どおしたぁ！")
      // via sender(), can get the ActorRef which send msg to us
      // final def sender(): ActorRef (sender is ActorRef type)
      sender() ! "fight"
    }
  }
}

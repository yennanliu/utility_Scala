package AkkaDemo1

import akka.actor.{Actor, ActorSystem, Props}

// https://www.bilibili.com/video/BV12N411R726?p=237

/**
 *  1) when helloActor extends Actor, it's an Actor now
 *  2) we need to override the receive method
 *  3) Actor is a trait
 */
class helloActor extends Actor {
  /**
   * 1. receive method, will be called by Actor's Mailbox method (hidden, implement Runnable)
   *    1-1) Mailbox is Runnable, so it will keep running if there is no quit mechanism
   * 2. when it's called ? when Mailbox receivers msg (from dispatcher)
   * 3. Receive is a partial func
   *     -> e.g. Receive = PartialFunction[Any, Unit]
   *             (receive Any type, and no return)
   */
  override def receive: Receive ={
    case "hello" => println("world")   // partial func
    case "wazzup" => println("hey buddy")
    case "123" => println("456")
    case "ok" => println("ok 2")
    case "exit" => {
      println("Quit ...")
      context.stop(self)  // stop ActorRef
      context.system.terminate()  // quit ActorSystem
    }
    case _ => println("???")
  }
}

// entry point
object helloActor extends App {

  println("helloActor start ...")

  // 1. create an ActorSystem -> for creating Actor
  private val actorFactory = ActorSystem("actorFactory")

  // 2. During create ActorSystem, return Actor's ActorRef
  //  2-1) props[helloActor] -> create a "helloActor" instance (Actor type)
  //  2-2) "helloActor" -> name the actor
  //  2-3) helloActorRef is the ActorRef of helloActor
  //  2-4) helloActor is managed by ActorSystem
  private val helloActorRef =  actorFactory.actorOf(Props[helloActor], "helloActor")

  // 3. Run (send msg to helloActor)
  // pattern : <Actor_receive_message> ! <message>
  helloActorRef ! "hello"
  helloActorRef ! "wazzup"
  helloActorRef ! "534/36/543645"
  helloActorRef ! "exit" // will quit the system

  println("helloActor end ...")
}

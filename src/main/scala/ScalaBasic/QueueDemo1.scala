package ScalaBasic

// https://www.youtube.com/watch?v=Bp6rNMgkQ48&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=127

import scala.collection.mutable

object QueueDemo1 extends App {

  // Make a queue
  val q1 = new mutable.Queue[Int]
  println("q1 = " + q1)

  /* Insert element
   *   1) += is an operator
   *   2) def +=(elem: A): this.type = { appendElem(elem); this }
   *   3) q1 += 20 in underlying : q1.$plus$eq(20)
   *   4) queue can have "duplicated" elements
   */
  q1 += 20 // q1.$plus$eq(20)
  q1 += 20 // q1.$plus$eq(20)
  println("q1 = " + q1)

  /* Insert list
   *   1)  ++= is an operator
   */
  q1 ++= List(2,4,6)  // get 2,4,5 from list and into queue one by one
  println("q1 = " + q1)  // queue ordering : 20,20,2,4,6 (left -> right)

  // If want any dtype, use [Any]
  val q2 = new mutable.Queue[Any]
  println("q2 = " + q2)
}

package ScalaBasic

// https://www.youtube.com/watch?v=IYpPAwCAZzs&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=128

import scala.collection.mutable

object QueueDemo2 extends App{
  // make a queue
  val q1 = new mutable.Queue[Int]
  q1 ++= List(1,2,3,4,5)
  println(q1)

  println("===============")

  // Delete element (always delete 1st element in queue)
  q1.dequeue()
  println(q1)   // Queue(2, 3, 4, 5)

  println("===============")

  // Add element (always add element as the final element in queue)
  q1.enqueue(9,8,7)
  println(q1)  // Queue(2, 3, 4, 5, 9, 8, 7)

  println("===============")

  // Get 1st element in queue
  println(q1.head) // not affect queue

  println("===============")

  // Get last element in queue
  println(q1.last) // not affect queue

  println("===============")

  /*
   * Get tail of the queue
   *   1) WILL RETURN ALL ELEMENTS EXCEPT 1ST ELEMENT (can use in for loop)
   *   2) this OP not affect queue
   *   3) return a queue
   *   4) this OP can do in looping
   */
  println(q1.tail) // not affect queue
  println(q1.tail.tail) // not affect queue
}

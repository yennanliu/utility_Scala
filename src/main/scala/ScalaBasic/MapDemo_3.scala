package ScalaBasic

// https://www.youtube.com/watch?v=jUlvvtlJOSI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=128

object MapDemo_3 extends App {
  // let's build a MUTABLE map (dynamic)
  /**
   *  Scala mutable map
   *  1) is NOT ordering
   *  2) need to use this class scala.collection.mutable.Map for using mutable map
   */

  val map3 = scala.collection.mutable.Map("jack" -> 10, "tim" -> 0, "amy" -> 999)

  println("map3 = " + map3)
}

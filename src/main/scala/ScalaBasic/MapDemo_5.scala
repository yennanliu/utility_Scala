package ScalaBasic

import scala.collection.Map

// https://www.youtube.com/watch?v=jUlvvtlJOSI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=128

object MapDemo_5 extends App {
  // make a Tuple map
  val map5 = Map(("A",1), ("B", 2), ("C", 3))
  // same as below way
  // val map3 = scala.collection.mutable.Map("jack" -> 10, "tim" -> 0, "amy" -> 999)
  println("map5 = " + map5)
  println(map5("B"))
}

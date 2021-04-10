package ScalaBasic

// https://www.youtube.com/watch?v=jUlvvtlJOSI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=128

object MapDemo_2 extends App {

  /**
   *  Scala immutable map
   *  1) is ordering
   *  2) underlying data structure is : Tuple2
   *  3) by default, map in Scala is immutable map
   */

  val map2 = Map("jack" -> 10, "tim" -> 0, "amy" -> 999)

  println("map2 = " + map2)

  println("=================")

  // get element from map
  println(map2("jack"))

  println("=================")

  // get keys from map
  println(map2.keys)

  println("=================")

  // get values from map
  println(map2.values)

  println("=================")

  // loop over map
  for (i <- map2){
    println(i)
  }

  println("=================")

  // loop over map : (k,v)
  for ((k, v) <- map2) {
    println((k,v))
  }

  println("=================")

  for (i <- map2) {
    println("key = " + i._1 + ",  value = " + i._2)
  }
}

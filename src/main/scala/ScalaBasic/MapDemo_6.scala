package ScalaBasic

import scala.collection.Map

// https://www.youtube.com/watch?v=jUlvvtlJOSI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=128

object MapDemo_6 extends App {
  // get values from map
  val map6 = Map(("A",1), ("B", 2), ("C", 3))


  // METHOD 1) directly
  println(map6("A")) // 1
  //println(map6("Z")) // exception : Exception in thread "main" java.util.NoSuchElementException: key not found: Z

  println("==============")

  // METHOD 2) contains
  if (map6.contains("Z")) {
    println(map6("Z"))
  } else{
    println("key not existed")
  }

  println("==============")

  // METHOD 3) via map.get
  println(map6.get("A")) // Some(1), is a collection as well
  println(map6.get("Z")) // None

  println("==============")

  // METHOD 4) getOrElse
  /*
   *  if key exists -> return its value
   *  if key NOT exists -> return default value
   */
  println(map6.getOrElse("A", "default"))
  println(map6.getOrElse("Z", "default"))
}

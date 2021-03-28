package ScalaBasic

// https://www.youtube.com/watch?v=lsr10PsA6Gk&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=107

object ArrayDemo1 extends App {

  /*   Array
   *   1) immutable (unchanged)
   */

  // create
  val arr01 = Array(10,20,30)

  // go through
  for (i <- arr01){
    println(i)
  }

  println("============")

  // modify
  arr01(0) = 90
  for (i <- arr01){
    println(i)
  }

  println("============")

  // create02
  var arr02 = new Array[Int](10)
  for (i <- arr02){
    println(i)
  }

}

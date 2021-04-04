package ScalaBasic

// https://www.youtube.com/watch?v=8Sl45vxkHiE&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=122

object TupleDemo1 extends App {
  /*
   *   1) make a tuple, (dtype = tuple4)
   *   2) tuple can only have up-to 22 elements (22 is maximum)
   *   3) get element in tuple :  tuple_1._1, tuple_1._2 .... (get 1st, 2nd element...)
   *   4) can get element via productElement (index) as well
   *   5) if want to looping over it, => need "iterator" (since tuple is not list)
   */
  val tuple_1 = (1,2,3, "hello")
  println(tuple_1)
  println(tuple_1._1)
  println(tuple_1._2)
  println(tuple_1._3)
  println(tuple_1._4)

  println("================")

  // or via productElement (start from 0)
  println(tuple_1.productElement(0))
  println(tuple_1.productElement(1))
  println(tuple_1.productElement(2))
  println(tuple_1.productElement(3))

  println("================")

  // for loop. since tuple is an one "set" -> we need iterator for looping it
  println("looping : ")
  for (item <- tuple_1.productIterator){
    println(item)
  }

  println("================")

  val tuple_22 = (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22)
  println(tuple_22)

  // below will raise error : too many elements for tuple: 23, allowed: 22
  //val tuple_23 = (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23)
  //println(tuple_23)
}

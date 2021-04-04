package ScalaBasic

/** Append element to a list */

// https://www.youtube.com/watch?v=6I1nahs8R4E&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=123

object ListDemo_3 extends App {

  /*
   * Example 1 : add element in the END of the list
   */
  val list_1 = List(1,2,4,"xxx")
  /** NOTE :  "+" is the side with actual element */
  val list_2 = list_1 :+ 4 // list_1 not changed, but return the new result in a new list
  println("list_2 = " + list_2)

  println("==============")

  /*
   * Example 2 : add element in the BEGIN of list
   */
  val list_a = List(1,2,4,"xxx")
  /** NOTE :  "+" is the side with actual element */  // : with collection side, + with element side ( :+ is a adding operator)
  val list_a_1 = 5 +: list_a // list_a not changed, but return the new result in a new list
  println("list_a_1 = " + list_a_1)

  // note : list_a is not changed
  println("list_a = " + list_a)
}

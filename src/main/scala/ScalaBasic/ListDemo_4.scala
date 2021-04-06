package ScalaBasic

// https://www.youtube.com/watch?v=dkroNiDsyQ4&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=126

object ListDemo_4 extends App {

  val list_1 = List(1, 2, 3,"abc")

  // Nil is a "null" list
  /*
   *  Step 1) : ()  (Nil is a "null" list)
   *  Step 2) : ( (1,2,3, "abc"))
   *  Step 3) : (6, (1,2,3, "abc"))
   *  Step 4) : ( 5, 6, (1,2,3, "abc"))
   *  Step 5) : ( 4, 5, 6, (1,2,3, "abc"))
   */
  val list_5 = 4 :: 5 :: 6 :: list_1 :: Nil

  /*
   *  Step 1) : (1,2,3, "abc")
   *  Step 2) : (6, 1,2,3, "abc")
   *  Step 3) : (5, 6, 1,2,3, "abc")
   *  Step 4) : (4, 5, 6, 1,2,3, "abc")
   */
  val list_6 = 4 :: 5 :: 6 :: list_1

  /** Note:  ::: operator is adding EVERY element in list to a NULL LIST */
  /*
 *  Step 1) : ()
 *  Step 2) : (1,2,3, "abc")   (put "abc", 3, 2, 1 .. to () by order)
 *  Step 3) : (6, 1,2,3, "abc")
 *  Step 4) : (5, 6, 1,2,3, "abc")
 *  Step 5) : (4, 5, 6, 1,2,3, "abc")
 */
  val list_7 = 4 :: 5 :: 6 :: list_1 ::: Nil

  println("list_5 = " + list_5)

  println("list_6 = " + list_6)

  println("list_7 = " + list_7)
}

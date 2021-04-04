package ScalaBasic

// https://www.youtube.com/watch?v=nKXq8C_86aU&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=118

object ArrayDemo2 extends App {

  // make some example array

  /*  METHOD 1) a fixed length (immutable) array
   *  1-1) "new" is a keyword
   *  1-2) [Int] (generic class) means the dtype that can be saved
   *      -> if Int => needs to save Int
   *      -> if Any => can save anything
   *  1-3) (10) means the length of array, can't be changed (length), btw value can be changed
   *  1-4) the underlying code (java)
   *      ```java
   *        int[] arr_1 = new int[10];
   *        arr_1[3] = 10;
   *      ```
   */
  val arr_1 = new Array[Int] (10)
  println("length = " + arr_1.length)
  arr_1(3) = 10
  for (i <- arr_1){
    println (i)
  }

  println("==============")

  val arr_2 = new Array[Any] (5)
  println("length = " + arr_2.length)
  arr_2(0) = "jack"
  arr_2(1) = 123
  arr_2(2) = false
  for (i <- arr_2){
    println (i)
  }

  println("==============")

  /* METHOD 2) a fixed length (immutable) array
   *   2-1) define directly (via "apply")
   *
   */
  val arr_3 = Array(1, 2, "xxx")
  println("length = " + arr_3.length)
  for (i <- arr_3){
    println(i)
  }
}

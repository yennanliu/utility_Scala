package ScalaBasic

import scala.collection.mutable.ArrayBuffer

// https://www.youtube.com/watch?v=7EWF_GFJC_0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=119

object ArrayToArrayBufferDemo1 extends App {

  /*  1) define a Array
   *   1-1) xxx.toArrayBuffer
   */
  val arr_01 = Array(1,2,3)
  /** Array ->  ArrayBuffer */
  val arr_01_b = arr_01.toBuffer
  println (arr_01_b.getClass)
  arr_01_b.append(99, 100, 101)
  arr_01_b(0) = 7878

  println("================")

  /*  2) define a ArrayBuffer
   *   2-1) xxx.toArray
   */
  val arrb_01 = ArrayBuffer("test", 1, 0, 3.14)
  /** ArrayBuffer -> Array */
  val arrb_01_array = arrb_01.toArray
  println(arrb_01_array.getClass)
  // arrb_01_array.append(10) <-- Array has NO append method
}

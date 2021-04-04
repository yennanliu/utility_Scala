package ScalaBasic

import scala.collection.mutable.ArrayBuffer

// https://www.youtube.com/watch?v=7EWF_GFJC_0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=119

object ArrayBufferDemo1 extends App {
  // let's define some mutable array

  /* METHOD 1)
   *  1-1) init elements (values) : (3,2,5)
   *  1-2) [Any] : generic class (here set "Any", means can put any type of elements in )
   *
   */
  var arrb_1 = ArrayBuffer[Any](3,2,5)
  for (i <- arrb_1){
    println(i)
  }
  println("arrb_1 lenght = " + arrb_1.length)
  println("arrb_1.hash = " + arrb_1.hashCode())

  /** ArrayBuffer support append */
  arrb_1.append(0, 90, 113.12323423)
  println("arrb_1(0) = " + arrb_1(0))
  println("arrb_1.hash = " + arrb_1.hashCode()) // in every append, scala will update the underlying space, so its hashcode changed

  /** ArrayBuffer support modify */
  arrb_1(0) = 777
  println("arrb_1(0) = " + arrb_1(0))
}

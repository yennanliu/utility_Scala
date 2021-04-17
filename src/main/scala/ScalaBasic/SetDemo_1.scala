package ScalaBasic

import scala.collection.mutable

object SetDemo_1 extends App {
  // 1) default is immutable set
  // non-ordering
  val set01 = Set(1,2,4, "abc")
  println(set01)

  // 2) use scala.collection.mutable for mutable set
  // non-ordering
  val set02 = mutable.Set(1,2,4, "abc")
  println(set02)
  set02 += "xyz"
  println(set02)
}

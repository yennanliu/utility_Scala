package ScalaBasic

// https://www.youtube.com/watch?v=F30wh_8Nw1g&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=132

import scala.collection.mutable

/** Set mutable, immutable demo */

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

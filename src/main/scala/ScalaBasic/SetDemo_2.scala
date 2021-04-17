package ScalaBasic

// https://www.youtube.com/watch?v=F30wh_8Nw1g&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=132

/** Set add demo */

import scala.collection.mutable

object SetDemo_2 extends App {

  val set02 = mutable.Set(1,2,4, "abc")
  println(set02)

  // method 1
  set02 += "xyz"

  // method 2 (add to current Set directly)
  set02.add(999)

  // method 3 (via this way will return a new Set)
  val Set02_ = set02.+(1001)

  println(set02)

  println(Set02_)
}

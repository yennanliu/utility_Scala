package ScalaBasic

// https://www.youtube.com/watch?v=F30wh_8Nw1g&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=132

import scala.collection.mutable

object SetDemo_3 extends App {

  val set03 = mutable.Set(1,2,4, "abc")
  println(set03)

  set03 -= 2

  println(set03)

  set03.remove("abc")

  println(set03)
}

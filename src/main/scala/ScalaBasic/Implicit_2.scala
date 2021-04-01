package ScalaBasic

// https://www.youtube.com/watch?v=7QGS5eEwP9A&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=111

object Implicit_2 extends App{

  // below will cause error
  //  -> f1, and f2 ARE WITH SAME INPUT AND OUTPUT DTYPE
  //  implicit def f1(l: Long): Int = {
  //    l.toInt
  //  }

  implicit def f2(l: Long): Int = {
    l.toInt
  }

  val num2: Int = 100L
  println("num2 = " + num2)
}

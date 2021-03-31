package ScalaBasic

// https://www.youtube.com/watch?v=xeJ60yxSp6o&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=110

object Implicit_1 extends App {

  // transform Double to Int automatically via implicit function
  /*
   *  1) There will be a function : f$1 in the low level
   *  2) implicit func ONLY ACCEPTS ONE ARGUMENT
   *  3) the implicit func will BE USED AUTOMATICALLY WHEN THERE IS SUCH CASE
   */
  implicit def f1(d: Double): Int = {
    d.toInt
  }

  // since we have implicit function : f1,
  // -> so any Double under this object will be automatically transformed to Int as below example
  val num: Int = 3.5 //  f$1(3.5)
  println("num = " + num)

  // more example
  // l: Long -> input dtype
  // Int -> output dtype
  implicit def f2(l: Long): Int = {
    l.toInt
  }

  val num2: Int = 100L
  println("num2 = " + num2)
}

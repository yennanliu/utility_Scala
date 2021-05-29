package ScalaBasic

// https://www.youtube.com/watch?v=Bh66GdPPKuw&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=167

object HigherOrderFuncDemo_7 extends App {

  /**
   *   Higher order func :
   *   -> A func that can get other func as input argument
   *
   *   1) test(f: Double => Double, n1: Double) is  a higher order func
   *   2) func input type : Double, output type : Double
   *   3) input arg type : Double
   */

  // example 1
  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  def sum(d: Double): Double = {
    d + d
  }

  // run
  val r1 = test(sum, 7.7)
  println("r1 = " + r1)

  println("==============")

  // example 2
  /**
   *  Higher order func :
   *
   *  1) minusxy will return a func
   *   -> the func :  (y: Int) => x - y
   *
   *  2) returned anonymous func uses outer var : x,
   *   the x and anonymous func now as a "closure"
   */
  def minusxy(x: Int) = {
    (y: Int) => x - y // anonymous func
  }

  val r2 = minusxy(3)(5)
  println("r2 = " + r2)

  println("==============")

  // f1 is (y: Int) = { x - y }  ( while x = 10 )
  val f1 = minusxy(10)  // f1 is a anonymous func
  println("f1 = " + f1)
  println(f1(1))
  println(f1(1))
  println(f1(2))

  println("==============")

  // anonymous func : y: Int) = { x - y }  ( while x = 20 )
  println(minusxy(20)(9))

  println("==============")

  // example 3
  def test2(x: Double) = {
    (y: Double) => x * x * y
  }

  val r3 = test2(2.0)(3.0)
  println("r3 = " + r3)
}

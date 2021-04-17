package ScalaBasic

// https://www.youtube.com/watch?v=Z571AAtK9es&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=133

object ListDemo_5 extends App {

  /**
   *  Example 1)
   *   make every element in list(3,5,7) multiply by 2
   *   and put the result into a new list
   */

  val list1 = List(3,5,7)

  // method 1)
  // pro : easy
  // cro : code is not elegant, efficiency, not FP
  var list1_r = List[Int]()
  for (item <- list1){
    list1_r = list1_r :+ item * 2
  }

  println("list1_r = " + list1_r)

  // method 2)
  def multiply2(x: Int): Int = {
    x * 2
  }
  val list1_r2 = list1.map(multiply2(_))
  println("list1_r2 = " + list1_r2)

  // method 3)
  val list1_r3 = list1.map(_ * 2)
  println("list1_r3 = " + list1_r3)

  // method 4) higher order func
  // pass the mul method as func into map
  // map is the "higher order func"
  def mul(x: Int): Int = {
    x * 2
  }
  val list1_r4 = list1.map(mul)
  println("list1_r4 = " + list1_r4)

  // Extra  : higher order function (can get other func as input)
  // f : input, a function (accept Double type and return Double type)
  //  n1 : a regular input
  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  def Mysum(d1: Double): Double = {
    d1 * 2
  }

  val result = test(Mysum, 2.0)
  println("result = " + result)
}

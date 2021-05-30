package ScalaBasic

// https://www.youtube.com/watch?v=smtulYDn7OU&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=172

object Curry_demo1 extends App {

  // Question : make a method return produce of 2 integer

  // example 1 : via regular method
  def mul(x: Int, y: Int) = x * y

  println(mul(10, 7))

  println("============")

  // example 2 : via closure
  def mulClosure(x: Int) = (y: Int) => x * y

  println(mulClosure(10)(7))

  println("============")

  // example 3 : via curry
  def mulCurry(x: Int)(y: Int) = x * y

  println(mulCurry(10)(7))
}

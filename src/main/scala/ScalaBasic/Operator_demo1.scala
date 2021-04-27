package ScalaBasic

// https://www.youtube.com/watch?v=oSq9JlaAelk&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=143

object Operator_demo1 extends App {

  // 1) if want to use "reserved" word, we need to add single comma : `xxx`
  var `var` = 10
  println ("var = " + `var`)

  println("================")

  // 2) "middle" operator
  val n1 = 1
  val n2 = 2
  var r1 = n1 + n2
  var r2 = n1.+(n2)  // n1 + n2

  println("r1 = " + r1 + ",  r2 = " + r2)

  println("================")

  // 3) "middle" operator example
  val dog = new Dog
  println(dog.age)
  dog.+(30)
  println(dog.age)

  dog + 30
  println(dog.age)

  println("================")

  // 4) "post" operator example
  val oper = new Operate
  println(oper++)   // same as run def ++()
  println(oper.++)  // same as run def ++()

  println("================")

  // 5) "pre" operator example
  val oper2 = new Operate2
  !oper2  //  def unary_!
}


class Dog { // "middle" operator example
  var age:Int = 10
  // let's define our "+" operator
  def +(n:Int): Unit = {
    age += n
  }
}

class Operate { //  "post" operator example
  // this method has no inout, so we can neglect the () here
  def ++() = "123"
}

class Operate2 { // "pre" operator example
  // this method has no inout, so we can neglect the () here
  def unary_! = println("!!!!!!!!!!!")
}
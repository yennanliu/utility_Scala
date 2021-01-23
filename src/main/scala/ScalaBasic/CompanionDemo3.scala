package ScalaBasic

// https://www.youtube.com/watch?v=t0rVwF5AF4E&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=69

object CompanionDemo3 extends App {

  // run
  val b_ = new B
  println(b_.say())

  println(B.sayHello(b_))

}

/* when in a file, there are the class and object with SAME NAME,
 * ( for example : class B, and object B )
 * then we call class B as "companion class",
 * and object B as "companion object"
 */
class B {
  private var person:String = "jack"
  def say(): Unit = {
    println(person)
  }
}

object B { // companion object can use "private" method in its companion class
  // NOTICE !!! in order to use companion class's method, we need to pass it to object first
  // e.g. sayHello(person:String)
  def sayHello(b:B): Unit = {
    println("person = " + b.person)
  }

}
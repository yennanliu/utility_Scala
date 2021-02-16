package ScalaBasic

// https://www.youtube.com/watch?v=Yt3WXQ8UAX4&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=83

object OverrideDemo3 extends App {

  // run
  val a:AAA = new BBB
  val b:BBB = new BBB

  // both a.get, and b.age are from same BBB in the java heap space
  println("a.age = " + a.age) // 20 (BBB.age)
  println("b.age = " + a.age) // 20 (BBB.age)
}

class AAA {
  // will have a method : public AAA.age under the hood
  val age: Int = 10
}

class BBB extends AAA {
  // override AAA's age
  override val age: Int = 20
}

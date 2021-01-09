package ScalaBasic

// https://www.youtube.com/watch?v=B7OQvnr4VGE&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=57
// https://www.youtube.com/watch?v=sfaZmAHNZwU&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=48

object ScalaDefaultValueDemo1 extends App{

  // run 1
  val p1 = new Person
  println( "p1.age = " + p1.age + " p1.hashCode() = " + p1.hashCode())

  val p1_ = p1
  println( "p1_.age = " + p1_.age + " p1_.hashCode() = " + p1_.hashCode())  // hashCode should as same as p1

  // let's change the value in p1_. then p1's value should change as well, since they ref same storage space
  println("------------------------------------")
  p1_.age = 99
  println( "p1_.age = " + p1_.age + " p1_.hashCode() = " + p1_.hashCode())
  println( "p1.age = " + p1.age + " p1.hashCode() = " + p1.hashCode())

  // run 2
  println("------------------------------------")
  val p2 = new Person
  p2.age = 100
  p2.name = "Sarah"
  println(p2.name)
  println(p2.age)
  println(p2.hashCode())

  class Person{
    // declare a default value must be var
    var name: String = _
    var age: Int = _
  }
}

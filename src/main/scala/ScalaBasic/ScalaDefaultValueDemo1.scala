package ScalaBasic

// https://www.youtube.com/watch?v=B7OQvnr4VGE&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=57
// https://www.youtube.com/watch?v=sfaZmAHNZwU&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=48

object ScalaDefaultValueDemo1 extends App{

  // run
  val p1 = new Person
  println(p1.name)
  println(p1.age)

  val p2 = new Person
  p2.age = 100
  p2.name = "Sarah"
  println(p2.name)
  println(p2.age)

  class Person{
    // declare a default value must be var
    var name: String = _
    var age: Int = _
  }
}

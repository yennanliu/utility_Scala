package ScalaBasic.ClassDemo2

object test extends App {
  // run
  val u1 = new User("001", "Amy", 29)
  val u2 = new User("002", "Lynn", 17)

  println(u1)
  println(u1.id)
  println(u1.name)
  println(u1.age)
}

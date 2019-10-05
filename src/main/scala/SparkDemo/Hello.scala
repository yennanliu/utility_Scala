package yen.scalautility

object Hello extends App {
  val p = Person("JIM")
  println("Hello from " + p.name)
}

case class Person(var name: String)

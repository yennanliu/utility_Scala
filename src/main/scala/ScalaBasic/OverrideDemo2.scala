package ScalaBasic

// https://www.youtube.com/watch?v=yOunWr2nLjM&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=78

object OverrideDemo2 extends App {
  // run
  val e1 = new Employer_02
  println(e1.name)
  println(e1.printName())

  // run 2
  val e2 = new Person_02
  println(e2.printName())
}

class Person_02 {
  var name: String = "jack"
  def printName(): Unit ={
    println("Person_02's printName")
    println("the name is " + name)
  }
}

class Employer_02 extends Person_02 {
  // need to override the printName method
  // since Employer_02 extends from Person_02
  override def printName(): Unit = {
    println("Employer_02's printName")

    // if want to use printName from its "parent" class (e.g. Person_02)
    super.printName()
  }
}

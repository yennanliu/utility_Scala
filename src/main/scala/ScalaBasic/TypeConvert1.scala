package ScalaBasic

// https://www.youtube.com/watch?v=8WYFeRImfi4&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=79

object TypeConvert1 extends App {

  // get class : Scala way
  println(classOf[String])
  println(classOf[Int])
  println(classOf[Float])
  println(classOf[Any])
  println(classOf[AnyVal])

  println("-----------------------")

  // get class : Java way
  val a = "abc"
  val b = 123
  println(a.getClass.getName)
  println(b.getClass.getName)

  println("-----------------------")

  // isInstance of class
  println(a.isInstanceOf[String]) // check if a is String class type
  println(a.isInstanceOf[Int])  // check if a is Int class type
  println(b.isInstanceOf[Int]) // check if b is String class type

  println("-----------------------")

  // AsInstance
  // *** If want to transform the class into the other "specific" class
  // *** declare a Employer_03 instance, but transform it to Person_03 class
  val emp:Person_03 = new Employer_03 // upper transform
  //emp.sayHello // can't use Employer_03's method

  // *** transform emp to Employer_03 class (asInstanceOf)
  emp.asInstanceOf[Employer_03].sayHello() // downward transform

}


class Person_03 {
  var name: String = "jack"
  def printName(): Unit ={
    println("Person_03's printName")
    println("the name is " + name)
  }
}

class Employer_03 extends Person_03 {
  // need to override the printName method
  // since Employer_03 extends from Person_03
  override def printName(): Unit = {
    println("Employer_03's printName")

    // if want to use printName from its "parent" class (e.g. Person_03)
    super.printName()
  }

  def sayHello(): Unit = {
    println ("this is Employer_03's sayHello")
  }
}

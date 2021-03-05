package ScalaBasic

// https://www.youtube.com/watch?v=qPLze6T1oLI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=97

object TraitDemo4 extends App {
  // run
  println("TraitDemo4 's OK")
  val a = new A_a_a
  a.sayOK()
  a.sayHello()

  // let's do sth interesting here
  // instantiate an Anonymous class from trait
  val TraitDemo04_1_obj = new TraitDemo04_1{
    override def sayOK(): Unit = {
      println("TraitDemo04_1_obj 's sayOK")
    }
  }

  println("====================")

  TraitDemo04_1_obj.sayHello()
  TraitDemo04_1_obj.sayOK()
}


trait TraitDemo04_1 {
  // abstract method
  def sayOK()
  // implemented method
  def sayHello(): Unit = {
    println("TraitDemo04_1 's sayHello")
  }
}

class A_a_a extends TraitDemo04_1{
  override def sayOK(): Unit = {
    println("A_a_a 's sayOK")
  }
}
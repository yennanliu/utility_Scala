package ScalaBasic

// https://www.youtube.com/watch?v=8WYFeRImfi4&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=79

object TypeConvert2 extends App {

  // a method test Polymorphism
  def test(p: Person_04): Unit = {
    // if the input class is Student_04, then run sayOK
    if ( p.isInstanceOf[Student_04] ){
      p.asInstanceOf[Student_04].sayOK // transform to Student_04 class
    } else if ( p.isInstanceOf[Worker_04] ){
      // if the input class is Worker_04, then run sayHola
      p.asInstanceOf[Worker_04].sayHola // transform to Worker_04 class
    } else {
      println("transform error !!!!")
    }
  }

  // run
  val s_01 = new Student_04
  val w_01 = new Worker_04
  test(s_01)
  test(w_01)
}


class Person_04 {
  var name: String = "jack"
  def printName(): Unit ={
    println("Person_04's printName")
    println("the name is " + name)
  }
}

class Student_04 extends Person_04 {
  val sId: Int = 100
  def sayOK: Unit = {
    println("OK!! | sId = " + this.sId)
  }
}

class Worker_04 extends Person_04 {
  val wId: Int = 777
  def sayHola: Unit = {
    println("HOLA!! | wId = " + this.wId)
  }
}
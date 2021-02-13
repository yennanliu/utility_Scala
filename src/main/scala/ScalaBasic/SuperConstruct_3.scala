package ScalaBasic

// https://www.youtube.com/watch?v=mivX3s4N0hI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=81

object SuperConstruct_3 extends App {

  // run
  val stu = new Student_07("Ann")
  stu.printName()
}

class Person_07 (pname : String) {
  var name: String = pname
  def printName(): Unit ={
    println("Person_07 's printName" + s", name = $pname")
  }
}

class Emp_07 (epname: String) extends Person_07(epname) {
  var empNo : Int = 10

  // need to use override here
  override def printName(): Unit ={
    println("Emp_07 's printName")

    // call parent's method via super
    super.printName()
  }
}

class Student_07 (StudentName: String) extends Person_07(StudentName) {
  var sNo : Int = 777

  // need to use override here
  override def printName(): Unit ={
    println("Student_07 's printName" + s", sNo = $sNo")

    // call parent's method via super
    super.printName()
  }
}
package ScalaHomework

// https://www.youtube.com/watch?v=H-FmptOzyBI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=86

class Manager extends Employee{

  val name: String = ""

  val salary: Double = 10000.0

  override def getAnnual(salary: Double): Double = {
    salary * 12
  }

  def managing(): Unit = {
    println("manager is managing lol")
  }

  def bonus(): Unit = {
    println("manager get bonus")
  }

}

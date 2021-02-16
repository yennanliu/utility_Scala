package ScalaHomework

// https://www.youtube.com/watch?v=H-FmptOzyBI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=86

class RegularEmployee extends Employee {

  override val name: String = ""

  override val salary: Double = 100.0

  override def getAnnual(salary: Double): Double = {
    salary * 12
  }

  def work(name:String): Unit = {
    println(s"$name is working ...")
  }
}

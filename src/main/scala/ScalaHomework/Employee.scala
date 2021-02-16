package ScalaHomework

// https://www.youtube.com/watch?v=H-FmptOzyBI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=86

abstract class Employee {
  val name: String
  val salary: Double
  def getAnnual(salary:Double):Double
}

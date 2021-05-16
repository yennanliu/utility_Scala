package ScalaBasic

// https://www.youtube.com/watch?v=MZo1NZz5aZE&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=157

object CaseClass3 extends App {
  // example
}

abstract class Amount

// Dollar is a case class, its constructor : Dollar(value: Double)
case class Dollar(value: Double) extends Amount

// Currency is a case class, its constructor : class Currency(value: Double, unit: String)
case class Currency(value: Double, unit: String) extends Amount

// NoAmount is also a case class
case object NoAmount extends Amount

// it's not necessary that case class to inherent from other class
case object AAA

case object BBB

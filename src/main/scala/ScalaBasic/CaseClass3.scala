package ScalaBasic

// https://www.youtube.com/watch?v=MZo1NZz5aZE&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=157

object CaseClass3 extends App {
  // example
  for (amt <- Array( Dollar(100.0), Currency(1000.0, "USD"), NoAmount) ) {
    val result = amt match {
      /**
       *  1) pattern match : use Dollar's "unapply" method under the hood
       *  2) will pass amt to unapply, and return a Some or None
       *  3) give returned value to v
       */
      case Dollar(v) => "$" + v
      case Currency(v, u) => v + " " + u
      case NoAmount => "nothing"
    }
    println(amt + " : " + result)
  }
}

abstract class Amount

// Dollar is a case class, its constructor : Dollar(value: Double)
case class Dollar(value: Double) extends Amount

// Currency is a case class, its constructor : class Currency(value: Double, unit: String)
case class Currency(value: Double, unit: String) extends Amount

// NoAmount is also a case class
case object NoAmount extends Amount

// it's not necessary that case class to inherent from other class
case object AAA2

case object BBB2

package ScalaBasic

// https://www.youtube.com/watch?v=MZo1NZz5aZE&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=157

object CaseClass4 extends App {
  /**
   * demo copy method in case class
   *   1) can copy directly
   *   2) can copy and update value in attr
   *
   *   ** NOTE : every obj from copy is a BRAND NEW OBJECT
   */
  val amt = Currency2(30.01, "JPY")
  val amt1 = amt.copy()   // make a new obj, but all attr are the same
  val amt2 = amt.copy(value = 777.777)  // make a new obj, but update value attr
  val amt3 = amt.copy(unit="GBP") // make a new obj, but update unit attr

  println(amt)
  println(amt1)
  println(amt2)
  println(amt3)
}

abstract class Amount2

// Dollar is a case class, its constructor : Dollar(value: Double)
case class Dollar2(value: Double) extends Amount2

// Currency is a case class, its constructor : class Currency(value: Double, unit: String)
case class Currency2(value: Double, unit: String) extends Amount2

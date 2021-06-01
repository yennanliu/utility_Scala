package ScalaBasic

// https://stackoverflow.com/questions/53986931/extend-case-class-from-another-case-class

/**
 *  Scala extends trait to case class example
 */

object CaseClass8 extends App {
  /// run

  val p1 = new PersonX("001")
  println(p1.identifier)

  println("===============")

  val e1 = new EmployeeX("002", 10000L)
  println(e1.identifier)
  println(e1.salary)
}

trait Identifiable {
  def identifier: String
}

case class PersonX(identifier: String) extends Identifiable {}

case class EmployeeX(identifier: String, salary: Long) extends Identifiable {}

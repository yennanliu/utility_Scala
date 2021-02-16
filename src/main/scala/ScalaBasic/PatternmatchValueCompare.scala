package ScalaBasic

// https://gist.github.com/colindean/ef062db69915b49d44b9#file-compare-scala-L51

object PatternmatchValueCompare extends App {

  def checkCreditGroup(x: Double): String = x match {
    case _ if (x <= 50) => "group 1"
    case _ if (x > 50 && x <= 100) => "group 2"
    case _ => "group 3"
  }

  // test
  println(checkCreditGroup(10))
  println(checkCreditGroup(50))
  println(checkCreditGroup(100))
  println(checkCreditGroup(999))
}

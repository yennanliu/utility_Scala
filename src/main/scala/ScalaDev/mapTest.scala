package ScalaDev

object mapTest extends App {

  val myList1 = List("a-true","b-false","c-true", "a-false")

  val r1 = myList1.map{
    x => {
      val _first = x.split("-")(0)
      val _second = x.split("-")(1)
      if (_second == "true"){
        (_first,"T")
      } else {
        (_first,"F")
      }
    }
  }.toList

  println("r1 = " + r1)
}

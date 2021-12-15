package ScalaAdvance.PackageDemo.service

// https://docs.scala-lang.org/zh-cn/tour/package-objects.html

package object myService {

  // attr
  case class Fruit(name: String, color: String)
  object Apple extends Fruit("Apple", "green")
  object Plum extends Fruit("Plum", "blue")
  object Banana extends Fruit("Banana", "yellow")

  val planted = List(Apple, Plum, Banana)

  // constructor
  class myService(host:String){

    // method
    def print(input:String):Unit = {
      println(">>>> input = " + input)
    }

    def dummyHttpCall(httpRequest:String):String = {
      s"this is my request : $httpRequest"
    }
  }

  // method
  def printDefault(input:String):Unit = {
    println(">>>> printDefault = " + input)
  }

}

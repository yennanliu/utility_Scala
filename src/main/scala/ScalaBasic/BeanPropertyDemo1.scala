package ScalaBasic

import scala.beans.BeanProperty

// https://www.youtube.com/watch?v=jlX4FMxU_YI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=63
// https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/ConstructorDemo5.scala

object BeanPropertyDemo1 extends App{

  // run 1
  val car = new Car
  println(car.getName)
  //println(car.gerPrice)  <-- no such method
  car.setName("Lexus")
  println(car.getName)
}

class Car{
  var price: Double = 10000.0 //should have public price() and public price_$eq() method

  /* once decorated with BeanProperty, below 4 methods will be generated automatically
   *   1) public name()
   *   2) public name_$eq()
   *   3) public setName()
   *   4) public getName()
   */
  @BeanProperty var name: String = "Benz"
}

package ScalaAdvance.PackageDemo

/**
 *  Scala Package object demo 1
 *
 *  ref :  https://github.com/yennanliu/til#20211215
 *
 */

import ScalaAdvance.PackageDemo.service.myService._

object demo1 extends App {

  // demo 1 : package attr, method
  println("planted " + planted)
  printDefault("123")

  println("=====================")

  // demo 2 : package constructor's attr, method
  val myService1  = new myService("m")
  println("myService1 = " + myService1.toString)
  myService1.print("hiiii")

  val res1 = myService1.dummyHttpCall("hitttt")
  println("res1 = " + res1)
}

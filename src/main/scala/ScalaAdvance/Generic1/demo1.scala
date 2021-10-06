package ScalaAdvance.Generic1

// https://www.bilibili.com/video/BV12N411R726?p=272

/**
 *  Generic basic intro
 *
 *  1) We can use generic type if we want our func can accept any type of input
 *
 *  2) for example : List in scala. We can put int, string.. into the List
 *     because it's using generic type
 *
 *  3) plz refer demo1, demo2, demo3 in this package
 */


object demo1 extends App {
  // run
  val int_msg = new IntMessage[Int](10)
  println("int_msg = " + int_msg)

  val str_msg = new StrMessage[String]("hola")
  println("str_msg = " + str_msg)
}

abstract class Message[T](s:T){
  // method
  def get() = s
}

class IntMessage[Int](v:Int) extends Message(v)
class StrMessage[String](v:String) extends Message(v)
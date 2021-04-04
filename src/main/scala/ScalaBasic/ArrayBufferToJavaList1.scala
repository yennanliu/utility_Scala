package ScalaBasic

import scala.collection.mutable.ArrayBuffer

// https://www.youtube.com/watch?v=fdQO6t_s8-k&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=121

object ArrayBufferToJavaList1 extends App {

  /************************
   * Scala ArrayBuffer -> Java List
   ************************/

  // make a scala ArrayBuffer
  val arr = ArrayBuffer("1", "2", "3")

  // import the needed implicit function
  // implicit def bufferAsJavaList[A](b: scala.collection.mutable.Buffer[A]): java.utils.List[A]
  import scala.collection.JavaConversions.bufferAsJavaList

  // below we use implicit function (bufferAsJavaList)
  //  -> so we can pass scala ArrayBuffer (arr) to the java ProcessBuilder constructor which only accept java list
  //  -> e.g. bufferAsJavaList transform arr to java list implicitly, so ProcessBuilder can use it
  // the return dtype of ProcessBuilder is "List<String>"
  val javaArr = new ProcessBuilder(arr)
  val arrList = javaArr.command()
  println("arrList = " + arrList)
  //println("arrList's dtype  = " arrList.getClass)

  /************************
  * Java List -> Scala ArrayBuffer
  ************************/

}

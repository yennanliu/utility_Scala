package ScalaBasic

// https://docs.scala-lang.org/overviews/scala-book/try-catch-finally.html

import java.io.{FileNotFoundException, IOException}
import scala.io.Source

object ExceptionDemo3 extends App {

  def openAndReadAFile(filename: String) = {
    val lines = Source.fromFile(filename).getLines.toList.toString()
    lines
  }

  // run 1
  var text = ""
  val filename = "xxx.txt"
  try {
    text = openAndReadAFile(filename)
  } catch {
    case e: FileNotFoundException => println("Couldn't find that file.")
    case e: IOException => println("Had an IOException trying to read that file")
    //case _ : Exception => println("openAndReadAFile failed") <-- this is collect all exception cases
  }

  println("================")

  // run2
  class FooException extends Exception{}
  class BarException extends Exception{}

  try {
    // your scala code here
    val x = 10 / 0
    println(x)
  }
  catch {
    case foo: FooException => println("FooException")
    case bar: BarException => println("BarException")
    case _: Throwable => println("Got some other kind of Throwable exception")
  } finally {
    // your scala code here, such as closing a database connection
    // or file handle
  }
}

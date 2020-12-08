package ScalaBasic

import scala.util.Try

// https://docs.scala-lang.org/zh-tw/tutorials/scala-for-java-programmers.html#%E7%89%B9%E8%B3%AA-traits
// https://fangjian0423.github.io/2015/06/07/scala-generic/

object TypeParameterlizationDemo_1 extends App {

    // example 1 
    class Reference[T] {
      private var contents: T = _
      def set(value: T) { contents = value }
      def get: T = contents
    }

    val myInt = new Reference[Int]
    myInt.set(999)
    println(myInt.get)

    val myStr = new Reference[String] 
    myStr.set("hello worldddd !")
    println(myStr.get)

    // example 2
    def position[A](xs: List[A], value: A): Int = {
        xs.indexOf(value)
    }

    position(List(1,2,3), 1) // 0
    position(List("one", "two", "three"), "two") // 1


    val x = position(List(1,2,3), 1)
    println(x)

    val y = position(List("one", "two", "three"), "two")
    println(y)
}
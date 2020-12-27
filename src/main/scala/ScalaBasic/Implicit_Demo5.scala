package ScalaBasic

// https://www.scala-exercises.org/std_lib/implicits

object Implicit_Demo5 extends App{

    println("Implicit_Demo5 run ...")

    class KoanIntWrapper(val original: Int) {
      def isOdd = original % 2 != 0
    }

    implicit def thisMethodNameIsIrrelevant(value: Int) =
      new KoanIntWrapper(value)

    // run
    println(19.isOdd)
    println(20.isOdd)

}
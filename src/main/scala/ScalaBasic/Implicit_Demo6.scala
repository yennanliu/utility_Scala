package ScalaBasic

// https://www.scala-exercises.org/std_lib/implicits

object Implicit_Demo6 extends App{

    println("Implicit_Demo6 run ...")

    class MyClass(val original: Int) {
      def isOdd = original % 2 != 0
      def addOne = original + 1
      def myPrint = println(s"the input is : $original")
    }

    implicit def MyImplicitMethod(value: Int) =
      new MyClass(value)

    // run
    // since Scala can't find any "addOne" method this scope, so will use the implicit one, and it  will use
    // MyClass then find "addOne" method under it then use it
    println(19.addOne)
    println(20.addOne)

    println(19.myPrint)
    println(20.myPrint)

    // compare
    val myclass = new MyClass(20)
    println(myclass.isOdd)
    println(myclass.addOne)
}
package ScalaBasic

// https://www.scala-exercises.org/std_lib/implicits

// Implicits rules can be imported into your scope with an import:

object Implicit_Demo7 extends App{

    println("Implicit_Demo7 run ...")

    object MyPredef {

        class KoanIntWrapper(val original: Int) {

        def isOdd = original % 2 != 0

        def isEven = !isOdd
    }

    implicit def thisMethodNameIsIrrelevant(value: Int) =
        new KoanIntWrapper(value)
    }


    // run
    import MyPredef._

    println(19.isOdd)
    println(20.isOdd)

    println(19.isEven)
    println(20.isEven)
}
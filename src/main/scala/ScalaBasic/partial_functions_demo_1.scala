package ScalaBasic

// https://www.scala-exercises.org/std_lib/partial_functions

// A partial function is a trait that when implemented can be used as building blocks to determine a solution. The trait PartialFunction requires that the method isDefinedAt and apply be implemented:

object partial_functions_demo_1 extends App{

    // example 1
    val doubleEvens: PartialFunction[Int, Int] =
      new PartialFunction[Int, Int] {
        //States that this partial function will take on the task
        def isDefinedAt(x: Int) = x % 2 == 0

        //What we do if this partial function matches
        def apply(v1: Int) = v1 * 2
      }

    val tripleOdds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
      def isDefinedAt(x: Int) = x % 2 != 0

      def apply(v1: Int) = v1 * 3
    }

    val whatToDo = doubleEvens orElse tripleOdds //Here we chain the partial functions together

    println(whatToDo(6))
    println(whatToDo(3))

    // example 1'
    val myValue = new PartialFunction[Int, Int]{

      def isDefinedAt(x: Int): Boolean =  x > 10

      def apply(y: Int) = y + 100
    }

    println(myValue(1))
    println(myValue(111))

    // example 2
    val doubleEvens_2: PartialFunction[Int, Int] = {
      case x if (x % 2) == 0 => x * 2
    }
    val tripleOdds_2: PartialFunction[Int, Int] = {
      case x if (x % 2) != 0 => x * 3
    }

    val whatToDo_2 = doubleEvens_2 orElse tripleOdds_2

    println(whatToDo_2(6))
    println(whatToDo_2(3))

    // example 3
    val doubleEvens_3: PartialFunction[Int, Int] = {
      case x if (x % 2) == 0 => x * 2
    }
    val tripleOdds_3: PartialFunction[Int, Int] = {
      case x if (x % 2) != 0 => x * 3
    }

    val printEven: PartialFunction[Int, String] = {
      case x if (x % 2) == 0 => "Even"
    }
    val printOdd: PartialFunction[Int, String] = {
      case x if (x % 2) != 0 => "Odd"
    }

    val whatToDo_3 = doubleEvens_3 orElse tripleOdds_3 andThen (printEven orElse printOdd)

    println(whatToDo_3(6))
    println(whatToDo_3(3))
}

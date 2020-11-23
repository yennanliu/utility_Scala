package ScalaBasic

// https://www.scala-exercises.org/std_lib/higher_order_functions
// Higher Order Functions: Higher Order Functions are functions that take functions as arguments and/or return functions.

object HigherOrderFuncDemo_3 extends App{

    def summation(x: Int, y: Int => Int) = y(x)

    def closure = (x: Int) => x + incrementer

    // run 
    var incrementer = 3
    val result = summation(10, closure)

    incrementer = 4 
    val result2 = summation(10, closure)

    println(result)
    println(result2)
}

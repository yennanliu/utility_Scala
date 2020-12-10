package ScalaBasic

// https://www.scala-exercises.org/std_lib/partially_applied_functions

object PartialAppliedFuncDemo_1 extends App {

    // A partially applied function is a function that you do not apply any or all the arguments, creating another function. This partially applied function doesn't apply any arguments.

    // example 1 
    def sum(a: Int, b: Int, c: Int) = a + b + c
    val sum3 = sum _

    println (sum3(1,3,5))
    println (sum(1,3,5))

    // example 2

    def sum2(a: Int, b: Int, c: Int) = a + b + c
    val sum2C = sum(1, 10, _: Int)
    val sum2D = sum(1, _: Int, _: Int)

    println (sum2C(4))
    println (sum2(4,5,6))
    println (sum2D(5,6))


    // example 3
    // Currying is a technique to transform a function with multiple parameters into multiple functions which each take one parameter:

    def multiply(x: Int, y: Int) = x * y
    println ((multiply _).isInstanceOf[Function2[_, _, _]])

    val multiplyCurried = (multiply _).curried
    println (multiply(4,5))
    println (multiplyCurried(3)(2))
    println (multiplyCurried(3))

    val multiplyCurriedFour = multiplyCurried(4)
    println (multiplyCurriedFour(2))
    println (multiplyCurriedFour(4))
}
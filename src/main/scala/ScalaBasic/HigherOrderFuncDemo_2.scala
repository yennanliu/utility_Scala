package ScalaBasic

// https://www.scala-exercises.org/std_lib/higher_order_functions
// Higher Order Functions: Higher Order Functions are functions that take functions as arguments and/or return functions.

object HigherOrderFuncDemo_2 extends App{
    def lambda = { x: Int => x + 1 }
    def lambda2 = (x: Int) => x + 2
    val lambda3 = (x: Int) => x + 3

    val lambda4 = new Function1[Int, Int] {
    def apply(v1: Int): Int = v1 - 1
    }

    def lambda5(x: Int) = x + 1

    // lambda(3) is as same as lambda.apply(3)
    val result = lambda(3)
    val result1andhalf = lambda.apply(3)

    // lambda(3) is as same as lambda.apply(3)
    val result_2 = lambda2(3)
    val result1andhalf_2 = lambda2.apply(3)

    val result2 = lambda2(3)
    val result3 = lambda3(3)
    val result4 = lambda4(3)
    val result5 = lambda5(3)

    // run
    println(result)
    println(result1andhalf)

    println(result_2)
    println(result1andhalf_2)

    println(result2)
    println(result3)
    println(result4)
    println(result5)
}

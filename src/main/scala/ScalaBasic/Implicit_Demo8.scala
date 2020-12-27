package ScalaBasic

// https://www.scala-exercises.org/std_lib/implicits

// Implicits can be used to automatically convert a value's type to another:

import java.math.BigInteger

object Implicit_Demo8 extends App{

    println("Implicit_Demo8 run ...")

    implicit def Int2BigIntegerConvert(value: Int): BigInteger =
        new BigInteger(value.toString)

    def add(a: BigInteger, b: BigInteger) = a.add(b)

    // run
    println(add(3,6))
    println(Int2BigIntegerConvert(9))
    println(add(3, 6).intValue)
}
package ScalaBasic

import scala.io.StdIn

// https://www.youtube.com/watch?v=L5guBZlFsU8&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=31

object ScalaReadCLIArgs_Demo1 extends App{

    println ("ScalaReadCLIArgs_Demo1 run ...")

    println("name")
    var name = StdIn.readLine()

    println("age")
    var age = StdIn.readShort()

    println("value")
    var value = StdIn.readDouble()

    println(s"name = $name")
    println(s"age = $age")
    println(s"value = $value")
}

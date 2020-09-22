package ScalaBasic

object Scala_yield_to_List extends App{ 

    val my_value:List[Int] = (
            for { i <- 1 to 20 }
            yield (i)
       ).toList

    println(my_value)

    val my_odd_value:List[Int] = (
            for { i <- 1 to 20 if i % 2 == 1 }
            yield (i)
       ).toList

    println(my_odd_value)

    val my_even_value:List[Int] = (
            for { i <- 1 to 20 if i % 2 == 0 }
            yield (i)
       ).toList

    println(my_even_value)

    val my_x_value:List[Int] = (
            for 
            { i <- 1 to 20 if i % 2 == 0 
              j = i + 1 }
            yield (j)
       ).toList

    println(my_x_value)
}
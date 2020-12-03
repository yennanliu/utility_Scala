package ScalaBasic

// https://www.scala-exercises.org/std_lib/lists

object ListDemo_1 extends App{

    // eq tests identity (same object)
    // == tests equality (same content)
    val a = List(1, 2, 3)
    val b = List(1, 2, 3)
    
    println ((a eq b)) // false 
    println(println ((a == b))) // true

    // Nil lists are identical, even of different types
    val a_2: List[String] = Nil
    val b_2: List[Int] = Nil

    println((a_2 == Nil)) // true
    println((a_2 eq Nil)) // true

    println((b_2 == Nil)) // true
    println((b_2 eq Nil)) // true

    println((a_2 == b_2)) // true
    println((a_2 eq b_2)) // true

    // Lists can be accessed via head, headOption and tail. Accessing a list via head is unsafe and may result in a IndexOutOfBoundsException.

    val a_3 = List(1, 2, 3)
    println(a_3.head)
    println(a_3.headOption)
    println(a_3.tail)

    val b_3 = List()
    // println(a.head) // will cause an IndexOutOfBoundsException exception
    println(a_3.headOption)

    // map a function to double the numbers over the list
    a_3.map { v =>
      v * 2
    } 

    a_3.filter { v =>
      v % 3 == 0
    }

    // Functions over lists can use _ as shorthand
    a_3.map {
      _ * 2
    }

    a_3.filter {
      _ % 2 == 0
    }

    // Functions over lists can use () instead of {}
    val a_4 = List(1, 2, 3)
    a_4.map(_ * 2) 
    a_4.filter(_ % 2 != 0)

    // Lists can be reduced with a mathematical operation
    val a_5 = List(1, 3, 5, 7)
    a_5.reduceLeft(_ + _) 
    a_5.reduceLeft(_ * _)

    // create a list from range
    val a_6 = (1 to 5).toList

    // You can prepend elements to a List to get a new List
    val a_7 = List(1, 3, 5, 7)

    println(0 :: a_7)

    // Lists can be concatened and Nil is an empty List:
    val head = List(1, 3)
    val tail = List(5, 7)

    head ::: tail 

    head ::: Nil

    // Lists reuse their tails
    val d = Nil
    val c = 3 :: d
    val b_8 = 2 :: c
    val a_8 = 1 :: b

    a_8 
    a_8.tail 
    c.tail
}

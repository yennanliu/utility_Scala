package ScalaBasic

object scala_basic_demo_3 {

  def main(args: Array[String]) {

    // 1) Tuples (Also really common with Spark!!)
    val captainStuff = ("Picard", "Enterprise-D", "NCC-1701-D")
    println(captainStuff)
    println(captainStuff._1) // Tuple index starts from 1
    println(captainStuff._2)
    println(captainStuff._3)

    // 2) key-value Tuples
    val picardsShip2 = "Picard" -> "Enterprise-D"
    println(picardsShip2._1)
    println(picardsShip2._2)

    // 3) mix of dtype Tuple
    val aBunchOfStuff = ("Kirk", 1964, true)
    println(aBunchOfStuff._1)
    println(aBunchOfStuff._2)

    // 4) List
    val shipList = List("Enterprise", "Defiant", "Voyager", "Deep Space Nine")
    println(shipList(0)) // List index start from 0
    println(shipList(1))
    println(shipList.head)
    println(shipList.tail)

    // 5) Iterating though a list
    for (x <- shipList) {
      println(x)
    }

    // 6) apply a function literal to a list! map() can be used to apply any function to every item in a collection.
    val backwardShips = shipList.map((x: String) => {
      x.reverse
    })
    for (x <- backwardShips) {
      println(x)
    }

    val backwardShips2 = shipList.map((x: String) => {
      x + " -- "
    })
    for (x <- backwardShips2) {
      println(x)
    }

    // 7) Reduce
    val numberList = List(1, 2, 3, 4, 5)
    val sum = numberList.reduce((x: Int, y: Int) => x + y)
    val product = numberList.reduce((x: Int, y: Int) => x * y)

    println(sum)
    println(product)

    // 8) filter() can remove stuff you don't want. Here we'll introduce wildcard syntax while we're at it.
    val iHateFives = numberList.filter((x: Int) => x != 5)
    val iHateThrees = numberList.filter(_ != 3)

    println(iHateFives)
    println(iHateThrees)

    // 9) Concatenating lists
    val moreNumbers = List(6, 7, 8) //> moreNumbers  : List[Int] = List(6, 7, 8)
    val lotsOfNumbers = numberList ++ moreNumbers //> lotsOfNumbers  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)

    // 10) More list tricks
    val reversed = numberList.reverse //> reversed  : List[Int] = List(5, 4, 3, 2, 1)
    val sorted = reversed.sorted //> sorted  : List[Int] = List(1, 2, 3, 4, 5)
    val lotsOfDuplicates = numberList ++ numberList //> lotsOfDuplicates  : List[Int] = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    val distinctValues = lotsOfDuplicates.distinct //> distinctValues  : List[Int] = List(1, 2, 3, 4, 5)
    val maxValue = numberList.max //> maxValue  : Int = 5
    val total = numberList.sum //> total  : Int = 15
    val hasThree = iHateThrees.contains(3) //> hasThree  : Boolean = false

    // 11) map - Useful for key/value lookups on distinct keys, Like dictionaries in other languages
    val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D", "Sisko" -> "Deep Space Nine", "Janeway" -> "Voyager")

    println(shipMap("Janeway"))
    println(shipMap.contains("Archer"))

    // 12) exception : Dealing with missing keys
    val archersShip = util.Try(shipMap("Archer")) getOrElse "Unknown"

    println(archersShip)

  }
}
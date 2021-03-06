package ScalaBasic

// https://www.scala-exercises.org/std_lib/pattern_matching
// https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/CaseHeadTailNil.scala

object PatternmatchDemo3 extends App{

    /*
     *   PART 1  : basic pattern match
     */

    // example 1 
    val stuff = "blue"

    val myStuff = stuff match {
      case "red" =>
        println("RED"); 1
      case "blue" =>
        println("BLUE"); 2
      case "green" =>
        println("GREEN"); 3
      case _ =>
        println(stuff); 0 // case _ will trigger if all other cases fail.
    }

    println(myStuff)

    // example 2
    val stuff2 = "blue"

    val myStuff2 = stuff2 match {
      case "red" => (255, 0, 0)
      case "green" => (0, 255, 0)
      case "blue" => (0, 0, 255)
      case _ => println(stuff); 0
    }

    println(myStuff2)

    // example 3 
    // Pattern matching can match complex expressions
    def goldilocks(expr: Any) =
      expr match {
        case ("porridge", "Papa") => "Papa eating porridge"
        case ("porridge", "Mama") => "Mama eating porridge"
        case ("porridge", "Baby") => "Baby eating porridge"
        case _ => "what?"
      }

    println (goldilocks(("porridge", "Mama")))
    println (goldilocks(("???")))

    // example 4
    // Pattern matching can wildcard parts of expressions
    def goldilocks2(expr: Any) =
      expr match {
        case ("porridge", _) => "eating"
        case ("chair", "Mama") => "sitting"
        case ("bed", "Baby") => "sleeping"
        case _ => "what?"
      }

    println(goldilocks2(("porridge", "Papa")))
    println(goldilocks2(("chair", "Mama")))

    // example 5
    // Pattern matching can substitute parts of expressions
    def goldilocks3(expr: (String, String)) =
      expr match {
        case ("porridge", bear) =>
          bear + " said someone's been eating my porridge"
        case ("chair", bear) => bear + " said someone's been sitting in my chair"
        case ("bed", bear) => bear + " said someone's been sleeping in my bed"
        case _ => "what?"
      }

    println(goldilocks3(("porridge", "Papa")))
    goldilocks3(("chair", "Mama"))

    // example 6
    // A backquote can be used to refer to a stable variable in scope to create a case statement - this prevents "variable shadowing":
    val foodItem = "porridge"
    def goldilocks4(expr: (String, String)) =
      expr match {
        case (`foodItem`, _) => "eating"
        case ("chair", "Mama") => "sitting"
        case ("bed", "Baby") => "sleeping"
        case _ => "what?"
      }

    println(goldilocks4(("porridge", "Papa")))
    println(goldilocks4(("chair", "Mama")))
    println(goldilocks4(("porridge", "Cousin")))
    println(goldilocks4(("beer", "Cousin")))

    // example 7
    def patternEquals(i: Int, j: Int) =
      j match {
        case `i` => true
        case _ => false
      }

    println(patternEquals(3, 3))
    println(patternEquals(7, 9))
    println(patternEquals(9, 9))


    /*
     *   PART 2  : pattern match with list
     */

    // https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/CaseHeadTailNil.scala

    // extends 8
    // To pattern match against a List, the list can be split into parts, in this case the head x and the tail xs. Since the case doesn't terminate in Nil, xs is interpreted as the rest of the list:

    val secondElement = List(1, 2, 3) match {
      case x :: xs => xs.head
      case _ => 0
    }

    println(secondElement) // 2 

    // example 9
    val secondElement2 = List(1, 2, 3) match {
      case x :: y :: xs => y
      case _ => 0
    }

    println (secondElement2)

    // example 10 
    val secondElement3 = List(1) match {
      case x :: y :: xs => y // only matches a list with two or more items
      case _ => 0
    }

     println (secondElement3)


     // example 11 
     val r = List(1, 2, 3) match {
      case x :: y :: Nil => y // only matches a list with exactly two items
      case _ => 0
    }

    println(r)


     // example 12
     val r2 = List(1, 2, 3) match {
      case x :: y :: z => z 
      case _ => 0
    }

    println(r2)

    // example 13
    val r3 = List(1, 2, 3) match {
      case x :: y :: z :: tail => tail
      case _ => 0
    }

    println(r3)
}
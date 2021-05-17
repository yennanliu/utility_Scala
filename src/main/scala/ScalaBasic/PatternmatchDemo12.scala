package ScalaBasic

// https://www.youtube.com/watch?v=uT1gcG_weYM&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=158

object PatternmatchDemo12 extends App {
  // example 1
  /**
   *  Pattern match with "Infix notation"
   *
   *  1) element1 :: element2 -> "Infix notation"
   *  2) first match first element, and second match second element, rest match rest of the elements
   *  3) only match "format", variables name can be variable ( e.g. : first, second, rest...)
   */
  List(1,3,5,9) match {
    case first :: second :: rest => println(first.toString +  ", " + second.toString + ",  rest.length = " + rest.length)
    case _ => println("pattern match failed")
  }

  // example 2
  List(1,3) match {
    case first :: second :: rest => println(first.toString +  ", " + second.toString + ",  rest.length = " + rest.length)
    case _ => println("pattern match failed")
  }

  // example 3
  List(1) match {
    case first :: second :: rest => println(first.toString +  ", " + second.toString + ",  rest.length = " + rest.length)
    case _ => println("pattern match failed")
  }

}

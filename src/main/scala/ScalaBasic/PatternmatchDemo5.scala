package ScalaBasic

// https://www.youtube.com/watch?v=UCcjJaRAql4&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=149

object PatternmatchDemo5 extends App {
  // run
  // example 1
  val ch = "V"
  // pattern : "any value" + match
  ch match { // ch is a variable
    case "+" => println("ok")
    /**
     *  1) will pass value of ch to mychar
     *  2) mychar can be used in next commands
     */
    case mychar => println("this is " + mychar)
    case _ => println("sth else")
  }

  println("===================")

  // example 2
  def f1(): Char = {'D'}

  // note : it's OK to call method in pattern match input
  ch + f1() match{
    case "+" => println("ok")
    case mychar => println("this is " + mychar)
    case _ => println("sth else")
  }

}

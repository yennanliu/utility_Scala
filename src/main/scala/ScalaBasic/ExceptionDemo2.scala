package ScalaBasic

// https://www.youtube.com/watch?v=BLSSJBV5Rx8&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=50

object ExceptionDemo2 extends App{
  /*
   *   General form :
   *      try {} catch {} finally {}          
   */
  try{

    var n = 10 / 0 

  } catch {

      // scala use "pattern matching" for Exception handling
      case e : ArithmeticException => println("ArithmeticException")
      case e : Exception => println("Exception") 

    } finally {  // the step that Scala will run anyway (whether Exception or not), so this one is good for cases such as DB closing, file cleaning...
    
    println("finally")
    
  }
}

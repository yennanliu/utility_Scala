package ScalaBasic

object ForLoop2 extends App {

  // let's define some methods
  def checkEven(x:Int):Boolean = {
    x % 2 == 0
  }

  // looping with conditions
  for (i <- 1 to 10){
    if (checkEven(i)){
      println(i)
    }
  }

  println("=================")
  // inverse condition
  for (i <- 1 to 10){
    if (! checkEven(i)){
      println(i)
    }
  }
}

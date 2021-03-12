package ScalaBasic

// https://alvinalexander.com/scala/scala-either-left-right-example-option-some-none-null/

object EitherLeftRight1 extends App {


  // demo 1 : method
  def divideXByY(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("Dude, can't divide by 0")
    else Right(x / y)
  }

  // demo 2 : pattern match
  divideXByY(1, 0) match {
      case Left(s) => println("Answer: " + s)
      case Right(i) => println("Answer: " + i)
    }

  // run
  // a few different ways to use Either, Left, and Right
  println(divideXByY(1, 0))
  println(divideXByY(1, 1))

  println("==============")

  def largerThanZero(x : Int): Unit = {
    if (x > 0){
      Left("x > 0")
    } else {
      Right("x < 0")
    }
  }

  // run 2
  println("input = 1 " + largerThanZero(1))
  println("input = -1 " + largerThanZero(-1))
  println("input = 0 " + largerThanZero(0))
}

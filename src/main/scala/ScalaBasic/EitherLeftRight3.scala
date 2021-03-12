package ScalaBasic

// https://qiita.com/KtheS/items/31d33f6556fc85b4b25b

object EitherLeftRight3 extends App {

  println(Right(1))
  println(Left(1))

  if (true) println(Right("OK")) else println(Left("FAIL"))

  if (2 > 1) println(Left("true")) else println(Right("false"))

  val r = Right(1)
  if (r.isRight) r else println("left")

  var x = Left("xxx")
  if (x.isLeft) x else println("right")
  if (x.isRight) x else println("left")
}

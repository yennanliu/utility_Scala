package ScalaBasic

// https://www.freecodecamp.org/news/a-survival-guide-to-the-either-monad-in-scala-7293a680006/

object EitherLeftRight4 extends App {

  // When we define an Either,
  // it can be (either) a Right or a Left
  val ok: Either[Error, String] =
  Right("That's right!")

  println(ok)

  println("================")

  val error: Either[Error, String] =
    Left(new Error("That's an error!"))

  println(error)

  println("================")

  // A stupid computation that may result in a Left or a Right
  def uncertainComputation(x: Float): Either[Error, String] =
    if (x > 0.5)
      Right("That's right!")
    else
      Left(new Error("That's an error!"))

    println(uncertainComputation(0.6f))
    println(uncertainComputation(0.3f))
}

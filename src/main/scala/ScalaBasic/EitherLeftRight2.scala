package ScalaBasic

// // https://www.scala-lang.org/api/2.12.0/scala/util/Either.html

object EitherLeftRight2 extends App {

  val in = Console.readLine("Type Either a string or an Int: ")
  val result: Either[String,Int] = try {
    Right(in.toInt)
  } catch {
    case e: Exception =>
      Left(in)
  }

  println(result match {
    case Right(x) => s"You passed me the Int: $x, which I will increment. $x + 1 = ${x+1}"
    case Left(x)  => s"You passed me the String: $x"
  })

}

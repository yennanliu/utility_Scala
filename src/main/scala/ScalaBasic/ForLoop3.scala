package ScalaBasic

object ForLoop3 extends App {

  def getYieldFromLoop(n:Int): IndexedSeq[Int] = {
    println(s"n = $n")
    for {i <- 1 to n}
      yield i
  }

  // TODO : fix this method
  def getFromLoop(n:Int): Array[Int] = {
    println(s"n = $n")
    val r = Array(1)
    for (i <- 1 to n){r :+ i}
    r
  }

  val result1 = getYieldFromLoop(3)
  println(result1)

  println("============")

  val result2 = getFromLoop(3)
  println(result2.foreach(println(_)))
}

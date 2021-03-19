package ScalaBasic

object ForLoop4 extends App {
  // until
  // V1
  var i = 0
  val till = 10
  for (j <- 0 until till ){
    println(j)
    i += 1
  }

  println("=============")

  // until + foreach
  var i_2 = 0
  (0 until till).foreach{
    i_2 += 1
    println(_)
  }
}

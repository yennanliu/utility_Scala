package ScalaBasic

object ForLoop1 extends App {

  // 1D looping
  for (i <- 1 to 10){
    println(i)
  }

  println("=================")

  // 2D looping
  for {
    i <- 1 to 5
    j <- 1 to 6
  } println(s"i = $i | j = $j")


  println("=================")

  // using "until"
  for (i <- 1 until 10){
    println(i)
  }

}

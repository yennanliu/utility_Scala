package ScalaBasic

// https://stackoverflow.com/questions/31345090/create-map-in-scala-using-loop

object MapDemo_7 extends App {

  var myMap1: Map[String, Int] = Map()

  for (i <- 1 to 7){
    println(i)
    myMap1 += (s"key-$i" -> i)
  }

  println(myMap1.toString())
}

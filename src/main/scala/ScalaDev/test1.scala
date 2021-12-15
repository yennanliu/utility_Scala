package ScalaDev

object test1 extends App {

  val x = List(1,2,3)

  val x_1 = x.map( (i:Int) => i+1)

  println (x_1.toString)

  List((1,2),(2,3),(3,4),(2,5)).map(x => x.toString)
}


package ScalaBasic

/**  mapOpDemo_3 : demo how to explicitly declare var type when do mapping*/


object mapOpDemo_3 extends App {

  val x = List(1,2,3,4,5)

  val x_1= x.map(x => x+1)
  println(x_1)

  println("================")

  // *** NOTE : via `(x:Int)` syntax, we can define var type explicitly in mapping
  val x_2= x.map( (x:Int) => x+1)
  println(x_2)

  println("================")

  val y = List("a","b","c")
  val y_1 = y.map(x => x + "-")
  println(y_1)

  // *** NOTE : via `(x:String)` syntax, we can define var type explicitly in mapping
  val y_2 = y.map( (x:String) => x + "-")
  println(y_2)
}

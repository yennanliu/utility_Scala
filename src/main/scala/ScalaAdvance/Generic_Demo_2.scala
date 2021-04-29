package ScalaAdvance

// https://www.jianshu.com/p/caca1ba8976e

object Generic_Demo_2 extends App {

  /** Example 1  generic class  */
  // define a generic class
  class Triple[X, Y, Z](val first: X, val second: Y, val thrid: Z)

  // scala will auto guess the type of below is Triple[String, Int, Double]
  val t1 = new Triple("spark", 3,2)

  // or you can define type explicitly
  val t2 = new Triple[String, String, Int]("hadoop", "flink", 100)

  println("t1 = " + t1.toString)
  println("t2 = " + t2.toString)

  println("====================")

  /** Example 2 generic func  */
  def getData[T](list: List[T]) = list(list.length/2)

  val f = getData[Int] _
  println(f(List(1,2,3,4,5)))
}

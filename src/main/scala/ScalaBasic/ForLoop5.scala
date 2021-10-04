package ScalaBasic

object ForLoop5 extends App {

  /** example 1 */
  for {
    i <- 1 to 3
    j <- 1 to 5
  } println(i, j)

  println("===============")

  /** example 2 */
  // is same as below
  for (i <- 1 to 3){
    for (j <- 1 to 5){
      println(i,j)
    }
  }

  println("===============")

  /** example 3 */

  def myfunc(x: Int, y: Int): Unit = {
    if ((x + y) % 2 == 0) {
      println(s"x = $x, y =$y. sum is even")
    }
  }

  for {
    i <- 1 to 3
    j <- 1 to 5
  } myfunc(i, j)

}
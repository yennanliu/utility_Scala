package ScalaBasic

object ScalaGetArg4 {
  def main(args: Array[String]){

    /*
     * example args : 1 2 3
     */

    val args1 = args(0)
    val args2 = args(1)
    val args3 = args(2)

    println(args1, args2, args3)

  }
}

package ScalaBasic

object ScalaGetArg3 {
  def main(args: Array[String]) = {
    println("ScalaGetArg3 start ...")

    println("args = " + args.toList.foreach(println(_)))

    if (args.length == 2) {
      val arg1:String = args.toList(0)
      val arg2:String = args.toList(1)
      println(s"arg1 = $arg1  |  arg2 = $arg2")
    }

    println("ScalaGetArg3 end ...")
  }

}

package ScalaBasic

object ScalaGetArgDemo_1 extends App{

  println("*** ScalaGetArgDemo_1 run ...")

  if (args.length > 0)
    println(s"this is args : ${args}")

  else
    println("no args ...")
}

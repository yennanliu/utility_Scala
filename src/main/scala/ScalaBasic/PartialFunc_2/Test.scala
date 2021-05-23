package ScalaBasic.PartialFunc_2

// https://www.youtube.com/watch?v=59nrDRKhcFA&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=164
// https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/PartialFunc_1/Test.scala

object Test extends App {

  /**
   *   Partial Func : simpler version V1
   */

  // NOTE : f2 NEEDS to be PartialFunction TYPE
  def f2:PartialFunction[Any, Int] = {
    // i accept the input (and as case variable)
    // if input type is Int, then do i + 1; else, do nothing
    case i:Int => i + 1 // NOTE : case syntax here can auto change to partial func
  }

  // run
  val l1 = List(1,2,3,4,"ABC")
  val ans2 = l1.collect(f2) // note : here we still need collect rather than map
  println("ans2 = " + ans2)

  println("======================")

  /**
   *   Partial Func : simpler version V2
   */

  val ans3 = l1.collect{case i:Int => i + 1}
  println("ans3 = " + ans3)
}

package ScalaBasic.anomaly_func1

// https://www.youtube.com/watch?v=8U_ZUJkeRNc&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=166

object AnomalyFun1 extends App {
  /**
   *  Anomaly Func
   *  1) Anomaly function : (x: Double) => x * 3
   *  2) input : x: Double
   *  3) code body : x * 3
   *  4) output type : can only use "type inference"
   *      - https://en.wikipedia.org/wiki/Type_inference
   *  5) use "{}" if code body has multiple lines
   */
  // demo1
  val triple = (x: Double) => x * 3
  println(triple(7))

  println("===================")

  // demo2
  val triple_plus_1 = (x: Double) => {
    val tmp =  x * 3
    tmp + 1
  }
  println(triple_plus_1(7))

  println("===================")

  // demo3
  val triple_plus_1_V2 = (x: Double) => {
    val tmp =  x * 3
    println("tmp = " + tmp)
    tmp + 1
  }
  println(triple_plus_1_V2(7))

  println("===================")

  // demo4
  val double_input_sum = (x: Double, y:Double) => {
    println("x = " + x + " y = " + y)
    val tmp =  x + y
    println("tmp = " + tmp)
    tmp
  }
  println(double_input_sum(99,1))
}

package ScalaBasic

object HigherOrderfuncDemo extends App{
    // higher order func can output as another func
    def mulBy(factor : Double) = (x : Double) => factor * x
    // factor = 5
    val quintuple = mulBy(5)
    // x = 20, -> 5 * 20 = 100
    println(quintuple(20))  // 100

}
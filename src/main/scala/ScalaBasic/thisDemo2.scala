package ScalaBasic

// https://www.youtube.com/watch?v=Fj1KinxSkbo&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=58

object thisDemo2 extends App{

  // run 1
  val rct_1 = new RCTclass
  rct_1.printRCT

  // run 2
  rct_1.length = 9.9
  rct_1.width = 7
  println(rct_1.getArea)

  class RCTclass{
    var length:Double = _
    var width:Double = _

    def printRCT:Unit = {
      for (i <- 0 until 9){
        for (j <- 0 until 6){
          print("*")
        }
        println()
      }
    }

    def getArea:Double = {
      (this.length * this.width).formatted("%.2f").toDouble
    }
  }
}

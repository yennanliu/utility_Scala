package ScalaBasic.Decorator1.coffeebar.myDecorator

import ScalaBasic.Decorator1.coffeebar.myCoffee.{DeCaf, LongBlack}

// https://www.bilibili.com/video/BV12N411R726?p=261

object CoffeeBar {

  def main(args: Array[String]): Unit = {

    println("coffeeBar ...")
    // order 1
    val order1:Drink = new DeCaf // order DeCaf coffee
    println("order1 price = " + order1.cost())
    println("order1 desc = " + order1.getDescription())

    println("-----------------------")

    // order 2
    val order2:Drink = new LongBlack // order LongBlack coffee
    println("order2 price = " + order2.cost())
    println("order2 desc = " + order2.getDescription())

    //java.io.FilterInputStream
  }
}

package ScalaBasic.Decorator1.coffeebar

import ScalaBasic.Decorator1.coffeebar.myCoffee.{DeCaf, LongBlack}
import ScalaBasic.Decorator1.coffeebar.myDecorator.{Milk, Soy}

object CoffeeBar {

  // entry point
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

    println("-----------------------")

    // order 3
    var order3:Drink = new LongBlack // order LongBlack coffee + 1 milk
    order3 = new Milk(order3)
    println("order3 price = " + order3.cost())
    println("order3 desc = " + order3.getDescription())

    println("-----------------------")

    // order 4
    var order4:Drink = new LongBlack // order LongBlack coffee + 1 milk + 1 soy
    order4 = new Milk(order4)
    order4 = new Soy(order4)
    println("order4 price = " + order4.cost())
    println("order4 desc = " + order4.getDescription())
  }
}

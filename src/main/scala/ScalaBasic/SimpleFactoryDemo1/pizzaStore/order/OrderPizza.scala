package ScalaBasic.SimpleFactoryDemo1.pizzaStore.order

// https://www.bilibili.com/video/BV12N411R726?p=254&spm_id_from=pageDriver

/** class for ordering */

import ScalaBasic.SimpleFactoryDemo1.pizzaStore.pizza.{GreekPizza, PepperPizza, Pizza}

import scala.io.StdIn
import util.control.Breaks._

class OrderPizza {
  // attr
  var orderType:String = _
  var pizza: Pizza = _

  breakable{
    do{
      println("plz insert pizza type (Simple Factory Mood)")
      orderType = StdIn.readLine()
      // NOTE : since SimplePizzaFactory is a factory
      // so we can use it directly (no need to instantiate)
      pizza = SimplePizzaFactory.createPizza(orderType)
      // if null input, then will break the program
      if (pizza == null){
        break()
      }
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)
  }
}

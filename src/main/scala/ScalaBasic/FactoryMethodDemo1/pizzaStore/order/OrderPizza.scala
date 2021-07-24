package ScalaBasic.FactoryMethodDemo1.pizzaStore.order

// https://www.bilibili.com/video/BV12N411R726?p=255&spm_id_from=pageDriver

/** class for ordering */

import ScalaBasic.FactoryMethodDemo1.pizzaStore.pizza.Pizza

import scala.io.StdIn
import util.control.Breaks._

/** here we make OrderPizza as abstract class */
abstract class OrderPizza {

  // attr
  var orderType:String = null
  var pizza: Pizza = null

  breakable{
    do{
      println("plz insert pizza type (Factory Mood)")
      orderType = StdIn.readLine()
      pizza = createPizza(orderType)
      if (pizza == null){
        break()
      }
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)
  }

  // method
  /** abstract method. subclass will implement it */
  def createPizza(t:String):Pizza{

  }
}

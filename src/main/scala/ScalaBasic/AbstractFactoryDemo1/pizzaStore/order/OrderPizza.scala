package ScalaBasic.AbstractFactoryDemo1.pizzaStore.order

// https://www.bilibili.com/video/BV12N411R726?p=256&spm_id_from=pageDriver

/** class for ordering */

import ScalaBasic.AbstractFactoryDemo1.pizzaStore.pizza.Pizza

import scala.io.StdIn
import util.control.Breaks._

/**
 * OrderPizza class
 *
 * With `abstract factory`, when we order a pizza
 * ->
 * 1) get the subclass instance, based on the requirement
 * to implement the subclass
 *
 *
 *
 */
class OrderPizza {

  def this(absFactory: AbsFactory) {
    this
    breakable {
      // attr
      var orderType: String = null
      var pizza: Pizza = null
      do {
        println("plz insert pizza type (Abstract Factory)")
        orderType = StdIn.readLine()
        // NOTE here
        pizza = absFactory.createPizza(orderType)
        if (pizza == null) {
          break()
        }
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
      } while (true)
    }
  }
}

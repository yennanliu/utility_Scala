package ScalaBasic.AbstractFactoryDemo1.pizzaStore.order

import ScalaBasic.AbstractFactoryDemo1.pizzaStore.pizza.Pizza

// https://www.bilibili.com/video/BV12N411R726?p=256&spm_id_from=pageDriver

/** factory Trait that can be implemented by other class factory  */

trait AbsFactory {
  // attr

  // method
  def createPizza(t:String): Pizza
}

package ScalaBasic.AbstractFactoryDemo1.pizzaStore.order

// https://www.bilibili.com/video/BV12N411R726?p=256&spm_id_from=pageDriver

import ScalaBasic.AbstractFactoryDemo1.pizzaStore.pizza.{NYCheesePizza, NYPepperPizza, Pizza}

/**
 * subclass (NYFactory) that implements trait AbsFactory
 *
 * -> if need NY pizza, we can use this class
 *
 */
class NYFactory extends AbsFactory {

  override def createPizza(t: String): Pizza = {
    var pizza:Pizza = null
    if (t.equals("cheese")){
      pizza = new NYCheesePizza
    } else if (t.equals("pepper")){
      pizza = new NYPepperPizza
    }
    pizza
  }
}

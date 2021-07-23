package ScalaBasic.SimpleFactoryDemo1.pizzaStore.order

import ScalaBasic.SimpleFactoryDemo1.pizzaStore.pizza.{CheesePizza, GreekPizza, PepperPizza, Pizza}

// https://www.bilibili.com/video/BV12N411R726?p=254&spm_id_from=pageDriver

/** Offer a class create pizza */

object SimplePizzaFactory {
  def createPizza(t:String):Pizza = {
    var pizza:Pizza = null
    if (t.equals("greek")) {
      pizza = new GreekPizza
    } else if (t.equals("pepper")){
      pizza = new PepperPizza
    }else if (t.equals("cheese")){
      pizza = new CheesePizza
    }
    pizza
  }
}

package ScalaBasic.FactoryMethodDemo1.pizzaStore.order
import ScalaBasic.FactoryMethodDemo1.pizzaStore.pizza.{NYCheesePizza, NYPepperPizza, Pizza}

// https://www.bilibili.com/video/BV12N411R726?p=255&spm_id_from=pageDriver

class NYOrderPizza extends OrderPizza {

  override def createPizza(t: String): Pizza = {
    println("use factory method !")
    var pizza:Pizza = null
    if (t.equals("cheese")){
      pizza = new NYCheesePizza
    } else if (t.equals("pepper")){
      pizza = new NYPepperPizza
    }
    pizza
  }
}

package ScalaBasic.SimpleFactoryDemo1.pizzaStore.order

// https://www.bilibili.com/video/BV12N411R726?p=254&spm_id_from=pageDriver

import ScalaBasic.SimpleFactoryDemo1.pizzaStore.pizza.{GreekPizza, PepperPizza, Pizza}

import scala.io.StdIn
import util.control.Breaks._

class OrderPizza {
  // attr
  var orderType:String = _
  var pizza: Pizza = _

  breakable{
    do{
      println("plz insert pizza type")
      orderType = StdIn.readLine()
      if (orderType.equals("greek")){
        this.pizza = new GreekPizza
      }else if (orderType.equals("pepper")){
        this.pizza = new PepperPizza
      }else{
        break()
      }
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)
  }
}

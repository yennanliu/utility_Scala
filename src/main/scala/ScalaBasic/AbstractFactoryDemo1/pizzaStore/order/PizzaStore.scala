package ScalaBasic.AbstractFactoryDemo1.pizzaStore.order

// https://www.bilibili.com/video/BV12N411R726?p=256&spm_id_from=pageDriver

/** Entry point */

object PizzaStore extends App {
  // run
  new OrderPizza(new NYFactory)
  //new OrderPizza(new LDNFactory)  // let's say we have a London pizza factory
}

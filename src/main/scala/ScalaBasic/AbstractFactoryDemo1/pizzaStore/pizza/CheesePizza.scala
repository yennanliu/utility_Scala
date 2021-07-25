package ScalaBasic.AbstractFactoryDemo1.pizzaStore.pizza

// https://www.bilibili.com/video/BV12N411R726?p=256&spm_id_from=pageDriver

class CheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "Cheese Pizza"
    println(this.name + " is preparing ...")
  }
}


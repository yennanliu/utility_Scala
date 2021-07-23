package ScalaBasic.SimpleFactoryDemo1.pizzaStore.pizza

// https://www.bilibili.com/video/BV12N411R726?p=254&spm_id_from=pageDriver

class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "Pepper Pizza"
    println(this.name + " is preparing ...")
  }
}

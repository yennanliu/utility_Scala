package ScalaBasic.FactoryMethodDemo1.pizzaStore.pizza

// https://www.bilibili.com/video/BV12N411R726?p=254&spm_id_from=pageDriver

class GreekPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "Greek Pizza"
    println(this.name + " is preparing ...")
  }
}

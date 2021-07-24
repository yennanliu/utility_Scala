package ScalaBasic.FactoryMethodDemo1.pizzaStore.pizza

// https://www.bilibili.com/video/BV12N411R726?p=254&spm_id_from=pageDriver

class UKPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "UK Pizza"
    println(this.name + " is preparing ...")
  }
}

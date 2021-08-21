package ScalaBasic.FactoryMethodDemo1.pizzaStore.pizza

// https://www.bilibili.com/video/BV12N411R726?p=255&spm_id_from=pageDriver

/** Abstract class */

abstract class Pizza {
  // attr
  var name:String = _

  // method
  def prepare()

  def cut():Unit = {
    println(this.name + " cutting ...")
  }

  def bake():Unit = {
    println(this.name + " baking ...")
  }

  def box():Unit = {
    println(this.name + " boxing ...")
  }
}
package ScalaBasic.Decorator1.coffeebar.myDecorator

// https://www.bilibili.com/video/BV12N411R726?p=261

/**
 *  1. Drink is an abstract class
 *
 */
abstract class Drink {
  // attr
  var description = ""
  private var price = 0.0f

  // getter, setter
  def setDescription(description:String):Unit = {
    this.description = description
  }

  def getDescription():String = {
    description + " price : " + this.getPrice()
  }

  def getPrice():Float = {
    price
  }

  def setPrice(p:String) = {
    this.price = p.toFloat
  }

  // make the cost method as abstract method
  def cost():Float
}



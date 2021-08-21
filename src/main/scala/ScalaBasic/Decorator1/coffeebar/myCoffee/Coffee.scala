package ScalaBasic.Decorator1.coffeebar.myCoffee

import ScalaBasic.Decorator1.coffeebar.myDecorator.Drink

// https://www.bilibili.com/video/BV12N411R726?p=261

// make a middle layer between Drink and DeCaf
// non-necessary for this project
class Coffee extends Drink{
  override def cost(): Float = {
    super.getPrice()
  }
}

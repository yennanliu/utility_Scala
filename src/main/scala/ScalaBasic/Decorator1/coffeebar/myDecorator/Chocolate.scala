package ScalaBasic.Decorator1.coffeebar.myDecorator

import ScalaBasic.Decorator1.coffeebar.Drink

// https://www.bilibili.com/video/BV12N411R726?p=261

class Chocolate(obj:Drink) extends Decorator(obj){
  super.setDescription("chocolate")
  super.setPrice("3.0f")
}

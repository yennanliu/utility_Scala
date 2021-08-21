package ScalaBasic.Decorator1.coffeebar.myDecorator

// https://www.bilibili.com/video/BV12N411R726?p=261

import ScalaBasic.Decorator1.coffeebar.Drink

class Soy(obj:Drink) extends Decorator(obj){
  super.setDescription("Soy")
  super.setPrice("1.0f")
}
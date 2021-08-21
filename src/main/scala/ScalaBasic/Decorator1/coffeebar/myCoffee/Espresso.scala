package ScalaBasic.Decorator1.coffeebar.myCoffee

// https://www.bilibili.com/video/BV12N411R726?p=261

/**
 *  1. As "Concrete" role in the decorator design pattern
 */
class Espresso extends Coffee {
  // use main constructor
  super.setDescription("Espresso")
  super.setPrice("10.0f")
}

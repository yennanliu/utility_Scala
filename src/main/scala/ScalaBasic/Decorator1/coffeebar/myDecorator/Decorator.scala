package ScalaBasic.Decorator1.coffeebar.myDecorator

import ScalaBasic.Decorator1.coffeebar.Drink

// https://www.bilibili.com/video/BV12N411R726?p=261

/**
 *  1. this is our Decorator
 *  2. still extends from drink
 *  3.
 */
class Decorator extends Drink{
  /**
   *  1. obj is the instance which is decorated
   *  2. obj can be Espresso, LongBlack.., Espresso + extra orders... and so on
   */
  private var obj:Drink = null

  // extra order will been added via this method
  // e.g.  order LongBlack coffee + 2 chocolate (ScalaBasic.Decorator1.coffeebar.CoffeeBar)
  def this(obj:Drink) {
    this
    this.obj = obj
  }

  // method
  // here we implement the cost method, we need use recursive way
  override def cost(): Float = {
    super.getPrice() + obj.cost()
  }

  // get below inform, we need use recursive way
  override def getDescription(): String = {
    super.getDescription() + " && " + obj.getDescription()
  }
}

package ScalaAdvance.LowerBounds1

// https://www.bilibili.com/video/BV12N411R726?p=276

/**
 *  Lower Bounds and Lower Bounds
 *
 *  1) Lower Bounds
 *   - Syntax : `>:`
 *   - Example : T is A's parent type
 *      -> T >: A
 *      (or _ >: A) (general form)
 *
 *  2) for lower bounds
 *    -> we can pass ANY CLASS TYPE
 *    (can't use upper bounds concept in lower bounds (not 100% mapping))
 *
 *  3) consider ` T >: A`, if T is not "A family" (e.g. not parent/child class of A)
 *     -> scala will treat ALL OF T as `Object` class
 *
 *  4) Lower bounds in java
 *    - T super A
 *    ( or ? super A) (general form)
 *     -> T is A's parent class
 */

object demo1 extends App {

  // run
  biological(Seq(new Earth, new Earth)).map(_.sound()) // ok, Earth is animal's parent class

  println("==============")

  biological(Seq(new Animal, new Animal)).map(_.sound()) // ok, animal is itself

  println("===== Bird example : =========")

  // *** NOTE this, here we don't use upper/lower bounds concept
  //     -> if class is not "animal family" (e.g. not parent/child class of animal)
  //        scala will treat ALL OF THEM as `Object` class
  biological(Seq(new Bird, new Bird)).map(_.sound())

  println("==============")

  val res = biological(Seq(new Bird))

  // here is the other example (-> if class is not "animal family" (e.g. not parent/child class of animal) scala will treat ALL OF THEM as `Object` class
  val res2 = biological(Seq(new Object))

  val res3 = biological(Seq(new Moon))

  println("res2 = " + res2)
  println("res3 = " + res3)

  // method
  // NOTE : T >: Animal. T is animal's parent class
  def biological[T >: Animal](things: Seq[T]) = {
    things
  }
}

class Earth{
  // method
  def sound(): Unit ={
    println("hello")
  }
}

class Animal extends Earth{
  // method
  override def sound(): Unit = {
    println("animal sounds")
  }
}

class Bird extends Animal{
  // method
  override def sound(): Unit = {
    println("bird sounds")
  }
}

class Moon{}
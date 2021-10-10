package ScalaAdvance.UpperLowerBounds1

// https://www.bilibili.com/video/BV12N411R726?p=274

/**
 *  Upper Bounds and Lower Bounds
 *
 *  1) Upper Bounds
 *   - Syntax : `<:`
 *   - Example : T is A's sub type
 *      -> T <: A
 *      (or _ <: A) (general form)
 */

object upperBoundsDemo1 extends App {
  // run

  /** demo 1 */
  val r1 = new CompareInt(10, 20)
  println("greater Int = " + r1.greater)

  println("========================")

  /** demo 2 */
  //val r2 = new CompareCommon(10,20) // NOT work, since Int class is NOT implement comparable method
  val r2 = new CompareCommon(Integer.valueOf(10), Integer.valueOf(20)) // this one works, since Integer class already implemented comparable method (Integer.valueOf is a java class)
  println("greater Int =  " + r2.greater)

  println("========================")

  /** demo 3 */
  val r3 = new CompareCommon(java.lang.Float.valueOf(10.1f), java.lang.Float.valueOf(20.1f)) // this one works, since Integer class already implemented comparable method
  println("greater Int =  " + r3.greater)

  println("========================")

  /** demo 4 : via generic type and implicit transform (scala float -> java float) */
  val r4 = new CompareCommon[java.lang.Float](10.1f, 20.1f) // this one works, since Integer class already implemented comparable method
  println("greater Int =  " + r4.greater)

}

/** 1) traditional way */
class CompareInt(n1:Int, n2:Int){
  // method
  // return the bigger value
  def greater:Int = {
    if (n1 > n2) n1 else n2
  }
}

/**
 *
 *  2) Upper bounds way
 *
 *   2-1) `T <: Comparable[T]` means T is Comparable's sub type
 *   2-2) T needs to inherit from Comparable interface
 *   2-3) so we can use compareTo method directly (from Comparable)
 *   2-4) T's upper bounds is Comparable[T], Comparable is the interface of int/float.. comparison
 *   2-5) T is the generic type
 *   2-6) pros of using Upper bounds:
 *        - can work for general(common) cases
 *
 */
class CompareCommon[T <: Comparable[T]](obj1:T, obj2:T){
  // method
  def greater:T = { // note : the returned type is T
    if (obj1.compareTo(obj2) > 0) obj1 else obj2
  }

}
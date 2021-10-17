package ScalaAdvance.ViewBounds1

// https://www.bilibili.com/video/BV12N411R726?p=277

/**
 *  View Bounds
 *
 *  1) View Bounds
 *   - Syntax : `<%`
 *   - Example :
 *
 *     def methodA [A <% B](arglist): R = ...
 *
 *     //equals as below
 *
 *     def method[A](arglist)(implicit viewAB: A => B): R = ...
 *
 *     // also equals as below
 *
 *     implicit def conver(a:A): B = ....
 *
 *  2) not only can be used in sub class, but also implicit class
 *
 *  3)  `<%` not only can be used in method, but also class attr parameter
 *     - e.g. :  class A[T <% Int]
 */


// entry point
object demo1 extends App {

  // run
  // demo 1
  // use an implicit transform (toInt)
  val compareComm1 = new CompareCommon(20.1,30)
  println(compareComm1.greater)

  println("==================")

  // demo 2
  // use an implicit transform (toInt)
  val compareComm2 = new CompareCommon(10.4,30.78)
  println(compareComm2.greater)

  println("==================")

  // demo 3 : before (explicitly define generic type (java.lang.Float))
  val compareComm3 = new CompareCommon[java.lang.Float](10.4f,30.78f)
  println(compareComm3.greater)
}

// 1) T <% Comparable[T] :
//    -> T is Comparable[T]'s child class type
// 2) difference between T <% Comparable[T] and T < Comparable[T] ?
//    -> T <% Comparable[T] can be used in more cases
//        -> e.g. implicit transform
// 3) View Bounds not only support `Upper bounds`, but also support simplified style (via implicit transform)
class CompareCommon[T <% Comparable[T]](obj1:T, obj2:T) {

  // attr

  // method
  def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}

package ScalaAdvance.ViewBounds1

// https://www.bilibili.com/video/BV12N411R726?p=278&spm_id_from=pageDriver

/** View bounds demo 2 : extend Ordered */

// entry point
object demo2 extends App {

  val p1 = new Person("tim", 7)
  val p2 = new Person("jim", 30)

  val compareComm2 = new CompareComm2(p1, p2)

  println(compareComm2.greater) // jim 30

  println("====================")

  val cat1 = new Cat("jerry")
  val cat2 = new Cat("tom")

  println(new CompareComm2(cat1,cat2).greater.name) // jerry
}

class Person(val name:String, val age:Int) extends Ordered[Person]{

  // method
  // override Ordered's compare method
  override def compare(that: Person): Int = {
    this.age - that.age
  }

  override def toString: String = {
    this.name + "\t" + this.age
  }
}

/**
 *  1) T <% Ordered[T] : T is Ordered's sub type, it implements java.lang.Comparable interface
 *
 *  2) compareTo in getter2 is T object's method
 *
 *  3) java ref
 *       - java.lang.Comparable ref : https://www.youtube.com/watch?v=n3xOIVricqQ&list=PLmOn9nNkQxJH0qBIrtV6otI0Ep4o2q67A&index=489
 *       - java.lang.Comparator ref : https://www.youtube.com/watch?v=PArFjm04xkg&list=PLmOn9nNkQxJH0qBIrtV6otI0Ep4o2q67A&index=491
 *
 */
class CompareComm2[T <% Ordered[T]](obj1:T, obj2:T){

  def greater = {
    if (obj1 > obj2) obj1 else obj2
  }

  def greater2 = {
    if (obj1.compareTo(obj2) > 0) obj1 else obj2
  }
}

// extra : the other class extend Ordered, and implement the compare method compare on length
class Cat(val name:String) extends Ordered[Cat]{
  override def compare(that: Cat): Int = {
    this.name.length - that.name.length
  }
}

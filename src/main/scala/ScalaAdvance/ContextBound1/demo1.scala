package ScalaAdvance.ContextBound1

// https://www.bilibili.com/video/BV12N411R726?p=280

/**
 *   Context bounds demo 1 :
 *
 *     1) similar as view bounds, context bounds is also a `language sugar` of implicit parameters
 *
 *
 *     Note : Difference between `Ordered` and `Ordering`:
 *
 *        -> Ordered : inherits from java's Comparable interface,
 *                     Comparable is an "internal" comparator, override CompareTo method
 *
 *        -> Ordering : inherits from java's Comparator interface,
 *                      Comparator is an "external" comparator, (need to implement a class for it)
 *
 */

object demo1 {

  // here we define a implicit value
  // ref : https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/Implicit_Demo4.scala
  implicit val personComparator = new Ordering[Person]{
    override def compare(p1: Person, p2: Person): Int = {
      p1.age - p2.age
    }
  }

  // entry point
  def main(args: Array[String]): Unit = {

    // -------------------
    // demo 1
    // -------------------
    val p1 = new Person("JAY",19)
    val p2 = new Person("lynn",20)
    // note : we have implicit parameter (personComparator), so generic is NOT NEEDED here
    val compareComm4 = new CompareComm4(p1, p2)
    println(compareComm4.greater)


    println("--------------------------")

    // -------------------
    // demo 2
    // -------------------
    val compareComm5 = new CompareComm5(p1, p2)
    println(compareComm5.greater)

    println("--------------------------")

    // -------------------
    // demo 3
    // -------------------

    println("(main func) personComparator hashcode = " + personComparator.hashCode())

    val compareComm6 = new CompareComm6(p1, p2)
    println(compareComm6.greater)
  }
}

// a simple Person class
class Person(val name:String, val age:Int) {
  // method
  override def toString: String = {
    this.name + "\t" + this.age
  }
}

/**
 *   Approach 1)
 *
 *   1) [T:Ordering] : generic type
 *   2) accept T type object
 *   3) implicit comparator:Ordering[T] : implicit parameter
 *          -> if there is any obj with type Ordering[T] in code, then such obj will be sent to this class automatically
 */
class CompareComm4[T:Ordering](obj1:T, obj2:T)(implicit comparator:Ordering[T]){
  def greater = {
    if (comparator.compare(obj1, obj2) > 0 ){
      obj1
    }else obj2
  }
}


/**
 *   Approach 2) : put implicit parameter into method
 */
class CompareComm5[T:Ordering](o1:T, o2:T){
  def greater ={
    // f1 will return an integer
    // (0 : o1 == o2, 1 : o1> > o2, -1: o1 < o2)
    def f1(implicit cmptor:Ordering[T]) = {
      cmptor.compare(o1,o2)
    }
    if (f1 > 0) o1 else o2
  }

  // extra
  def lower ={
    def f1(implicit cmptor:Ordering[T]) = {
      cmptor.compare(o1,o2)
    }
    if (f1 > 0) o2 else o1
  }
}

/**
 *   Approach 3) : use implicitly language sugar, simplest (recommend to use!)
 */
class CompareComm6[T:Ordering](o1:T, o2:T){
  def greater = {
    val comparator = implicitly[Ordering[T]]
    // below code will make an implicit transformation,
    // get the implicit value (personComparator)
    // above process (binding value) is operated by compiler under the hood (during compile)
    println("(CompareComm6) CompareComm6 comparator = " +  comparator.hashCode())
    if (comparator.compare(o1, o2) > 0) o1 else o2
  }
}
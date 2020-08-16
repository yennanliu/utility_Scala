// https://docs.scala-lang.org/tour/tour-of-scala.html

/*
Traits are used to share interfaces and fields between classes. 
They are similar to Java 8’s interfaces. Classes and objects can extend traits, 
but traits cannot be instantiated and therefore have no parameters.
*/

package ScalaBasic

object TraitDemo2 extends App{

    // define trait

    trait HairColor // trait has no parameters

    // Traits become especially useful as generic types and with abstract methods
    // Extending the trait Iterator[A] requires a type A and implementations of the methods hasNext and next
    trait Iterator[A]{
        def hasNext: Boolean
        def next(): A
    }

    // using trait
    // Use the extends keyword to extend a trait. Then implement any abstract members of the trait using the override keyword
    class IntIterator(to: Int) extends Iterator[Int]{
        private var current = 0
        override def hasNext: Boolean = current < to
        override def next(): Int = {
            if (hasNext){
            val t = current
            current += 1
            t 
        } else 0
      }
    }

    // run
    val iterator = new IntIterator(10)
    println(iterator.next())  // returns 0
    println(iterator.next())  // returns 1
    println(iterator.next())  // returns 2

}
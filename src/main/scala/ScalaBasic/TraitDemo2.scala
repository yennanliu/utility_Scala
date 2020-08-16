// https://docs.scala-lang.org/tour/tour-of-scala.html
// https://docs.scala-lang.org/overviews/scala-book/traits-intro.html

/*
Traits are used to share interfaces and fields between classes. 
They are similar to Java 8’s interfaces. Classes and objects can extend traits, 
but traits cannot be instantiated and therefore have no parameters.
*/

package ScalaBasic

object TraitDemo2 extends App{

    // PART 1 : define trait

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

    // PART 2 Subtyping

    import scala.collection.mutable.ArrayBuffer

    trait Pet {
        val name: String
    }

    class Cat(val name: String) extends Pet
    class Dog(val name: String) extends Pet

    val dog = new Dog("poppy")
    val cat = new Cat("tom")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name))

    // PART 3 MY PRACTICE

    trait CarSize
    trait CarColor

    trait CarClass{
        def getAge: Int
        def getName: String
        def getPrice: Int
    }

    class GetCarProfile(age: Int, name: String, price: Int) extends CarClass{
        override def getAge: Int = age
        override def getName: String = name
        override def getPrice: Int = price
        def ifexpensive: Boolean = price > 99999
    }

    val benz = new GetCarProfile(3, "BENZ", 1000)
    println(benz.getAge)
    println(benz.getName)
    println(benz.getPrice)
    println(benz.ifexpensive)

}
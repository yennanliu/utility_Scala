package ScalaBasic

// https://openhome.cc/Gossip/Scala/UpperboundLowerboundViewbound.html
// https://ithelp.ithome.com.tw/articles/10194355
// https://docs.scala-lang.org/tour/lower-type-bounds.html

object UpperCass extends App{

    abstract class Animal {
     def name: String
    }

    abstract class Pet extends Animal {}

    class Cat extends Pet {
      override def name: String = "Cat"
    }

    class Dog extends Pet {
      override def name: String = "Dog"
    }

    class Lion extends Animal {
      override def name: String = "Lion"
    }

    class PetContainer[P <: Pet](p: P) {
      def pet: P = p
    }

    // run
    val dogContainer = new PetContainer[Dog](new Dog)
    val catContainer = new PetContainer[Cat](new Cat)

    println(dogContainer)
    println(catContainer)

    // this would not compile
    //val lionContainer = new PetContainer[Lion](new Lion)
}
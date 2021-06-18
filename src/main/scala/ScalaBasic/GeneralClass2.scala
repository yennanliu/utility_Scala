package ScalaBasic

// https://docs.scala-lang.org/tour/upper-type-bounds.html
// https://docs.scala-lang.org/zh-cn/tour/upper-type-bounds.html
// https://www.jianshu.com/p/caca1ba8976e


object GeneralClass2 extends App {

  /**
   *  TYPE BOUNDS
   *
   *  1) An Upper type bound `T <: A`
   *  declares that type variable T must be a sub type of type A.
   *
   *  2) A down type bound `T >: A`
   *  declares that type variable T must be a super type of type A.
   *
   */

  // demo 1

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

  // here we make P must be Pet's subclass
  class PetContainer[P <: Pet](p: P) {
    def pet: P = p
  }

  // let's define a random class
  class Car

  val dogContainer = new PetContainer[Dog](new Dog)
  val catContainer = new PetContainer[Cat](new Cat)

  println("dogContainer = " + dogContainer)
  println("catContainer = " + catContainer)

  // below one not works, since Car is not Per's subclass
  // Error:(52, 7) type arguments [ScalaBasic.GeneralClass2.Car] do not conform to class PetContainer's type parameter bounds [P <: ScalaBasic.GeneralClass2.Pet]
  //val carContainer = new PetContainer[Car](new Car)

  println("=================")

  // demo 2
  class Pair[T <: Comparable[T]](val first: T, val second: T) {
    def bigger = if(first.compareTo(second) > 0) first else second
  }

  val pair = new Pair("Spark", "Hadoop")
  println(pair.bigger)  //Spark

  println("=================")

  // demo 3
  abstract class notebook

  class macBook extends notebook

  class chromeBook extends notebook

  class notebookStore[T <: notebook]{
    def showNotebook(x:T): Unit = {
      println("notebook = " + x)
    }

    def hello(): Unit = {
      println("helllooooo")
    }
  }

  val nb_store1 = new notebookStore[macBook]
  nb_store1.showNotebook(new macBook)

  val nb_store2 = new notebookStore[chromeBook]
  nb_store2.showNotebook(new chromeBook)
}

package ScalaBasic


object ScalaClassDemo{
    // simple class 
    class Counter{
        private var value = 0 
        def increment(): Unit = {value += 1}
        def current() = value
    }

    // class with "getter", "setter" method
    class Person{
        private var privateAge = 0 // set as private var

        // "getter" method in scala
        def age = privateAge 

        // "setter" method in scala
        def age_= (newValue: Int): Unit = {
            if (newValue > privateAge) privateAge = newValue
          }
    }

    // class with "getter" method only
    class Message{
        val timestamp = new java.util.Date
    }

    // class access another private val in the same class
    // TODO :  check again 
    class Counter2{
        private var value = 0
        def increment(): Unit = { value += 1 }
        def isLess(other: Counter2) = value < other.value
    }

    // Bean property
    //import scala.reflect.BeanProperty

    def main(args: Array[String]){ 
        // use class Counter
        val myCounter = new Counter // or new Counter()
        myCounter.increment()
        println(myCounter.current())

        // use Person and its getter, setter method
        val fred = new Person
        fred.age = 30 
        fred.age = 21
        println(fred.age) //30

    }
}
package ScalaBasic

object AbstractDemo extends App {

    // abstract method
    abstract class Person(val name: String){
        def id : Int // there is no "actual" method, so it's a abstract method
    }

    class Employee(name: String) extends Person(name){
        def id = name.hashCode  // there is no need to have "override" word when re-write abstract method
    }

    val tom = new Employee("tom")
    println(tom.name)
    println(tom.id)

    // abstract string 
    abstract class Person2{
        val id: Int       // no initialize, this is a abstract string with "getter" method
        var name: String  // this is a abstract string with "getter" and "setter" method
    }

    val fred = new Person2{
        val id = 7270
        var name = "fred"
    }

    println(fred)
    println(fred.id)
    println(fred.name)
}
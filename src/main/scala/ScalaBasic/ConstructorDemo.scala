package ScalaBasic

object ConstructorDemo extends App {

// example 1 
class Person(val name: String, val age: Int) {
    println("will construct another person")
    def description = name + " is " + age + " years old"
}
val jim = new Person("jim", 10)
println(jim.description)

// example 2
class Book(var title:String)
val book = new Book("scala cool!")
println(book.title)
book.title = "new title"
println(book.title)
}
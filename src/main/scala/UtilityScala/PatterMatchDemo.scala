object PatterMatchDemo {
   def main(args: Array[String]) {

       val alice = new Person("Alice", 25)
       val bob = new Person("Bob", 32)
       val charlie = new Person("Charlie", 32)
   
    for (person <- List(alice, bob, charlie)) {
        person match {
            case Person("Alice", 25) => println("Hi Alice!")
            case Person("Bob", 32) => println("Hi Bob!")
            case Person(name, age) => println("Are you " + name + " with age = " + age + "?")
         }
      }
   }
   // Person class 
   case class Person(name: String, age: Int)
}
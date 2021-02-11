package ScalaBasic

// https://www.youtube.com/watch?v=EeN3v0zAsgg&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=80

object SuperConstruct extends App {

 // run 1
 val emp = new Employer_5("tom")
  println(emp.name)

  println("---------------------")

 // run 2
 val emp2 = new Employer_5()
  println(emp2.name)
}

// Person_5 is Employer_5's father class
// Person_5's default main constructor is Person_5()
class Person_5 {
  var name = "kyo"
  println("Person_5 ....")
}

// Employer_5 is Person_5's children class
// Employer_5's default main constructor is Employer_5()
class Employer_5 extends Person_5 {
  def this(name: String){
    this // have to call main constructor at beginning
    this.name = name
    println("Employer_5 ....")
  }
}
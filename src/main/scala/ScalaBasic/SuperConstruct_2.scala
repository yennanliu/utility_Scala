package ScalaBasic

// https://www.youtube.com/watch?v=mivX3s4N0hI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=81


object SuperConstruct_2 extends App {

  // run
  val e_6 = new Emp_06()
  println(e_6.name)
}

class Person_06 {
  var name = "tomy"
  println ("Person_06 ...")
}

class Emp_06 extends Person_06() { // in scala, we can call parent's constructor here
   // super() // will be wrong, since we CAN'T call children's constructor here

  def this(name: String){
    this // have to call main constructor here
    this.name = name
    println("Emp_06 ...")
  }

//  def this(age : Int){
//    super() // will be wrong, since we CAN'T call parent's constructor in children's support constructor
//  }

}
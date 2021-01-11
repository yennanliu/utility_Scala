package ScalaBasic

// https://www.youtube.com/watch?v=ADyLvAc6yXc&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=60

object ConstructorDemo3 extends App{
  // run 1
  val p1 = new MyPerson3()
  println("p1.age = " +  p1.age + " p1.name = " + p1.name)

  // run 2
  val p2 = new MyPerson3("kim")
  println("p2.age = " + p2.age + " p2.name = " + p2.name)

  // run 3
  val p3 = new MyPerson3("iori", 17)
  println("p3.age = " + p3.age + " p3.name = " + p3.name)
}

class MyPerson3{ // main constructor
  var age: Int = _
  var name: String = _

  // support constructor 1 : for name
  def this(name: String){
    // every support constructor needs to use main constructor
    // and the main constructor needs to be in the 1st line of method, e.g. this()
    // *** notice : support constructor and main constructor should be in the same format
    this() // use main constructor
    this.name = name
  }

  // support constructor 2 : for age
  def this(age: Int){
    this() // use main constructor
    this.age = age
  }

  // support constructor 3 : for name and age
  def this(name: String, age: Int){
    this() // use main constructor
    this.name = name
    this.age = age
  }
}

package ScalaBasic

// https://www.youtube.com/watch?v=ADyLvAc6yXc&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=60

object ConstructorDemo2 extends App {

  // run 1
  val p1 = new MyPerson2(22, "jack")
  println("p1.age = " + p1.age + " p1.name = " + p1.name)

}

class MyPerson2(inAge: Int, inName: String) { // main constructor
  var age: Int = inAge
  var name: String = inName
}

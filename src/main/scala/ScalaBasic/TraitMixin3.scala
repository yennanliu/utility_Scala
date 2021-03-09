package ScalaBasic

// https://www.youtube.com/watch?v=UL0kERWHLt0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=98

object TraitMixin3 extends App {

  //Trait mixin on the abstract class, in order to add some methods on it
  val mySQL = new MySQL3 with Operator4
  mySQL.insert(100)
}

abstract class MySQL3{
}

trait Operator4 {
  def insert(id: Int): Unit = {
    println("insert value = " + id)
  }
}
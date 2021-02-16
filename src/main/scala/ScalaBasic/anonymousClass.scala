package ScalaBasic

// https://www.youtube.com/watch?v=EeN3v0zAsgg&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=80

object anonymousClass extends App {

  // run
  val monster = new Monster {

    override var name: String = _

    // implement the abstract method
    override def cry(): Unit = {
      println("cry cry cry")
    }
  }

  println("anonymousClass ...")
  println(monster.name)
  monster.cry()
}

// abstract class
abstract class Monster {
  var name: String // abstract attribution
  def cry() // abstract method
}
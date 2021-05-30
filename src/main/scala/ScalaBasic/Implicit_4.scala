package ScalaBasic

// https://www.youtube.com/watch?v=smtulYDn7OU&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=172

object Implicit_4 extends App {
  // run
  val db1 = new DB1(new MySql1)
  println(db1.addSuffix())
  println(db1.sayOK())

  /**
   *  implicit class
   *  -> for adding new methods to an already-defined class
   *
   *  1) will make a .class implicitClass$DB1$2 under the hood
   *  2) and also make a method : DB1$1 // via implicitClass$DB1$2 constructor, return implicit class instance
   *
   */
  // implicit class
  implicit class DB1(val m: MySql1) {
    def addSuffix(): String = {
      m + " scala"
    }

    @Override
    def sayOK(): Unit = {
      println("db1 sayOK")
    }
  }

  // class
  class MySql1 {
    def sayOK(): Unit = {
      println("say ok")
    }
  }

}

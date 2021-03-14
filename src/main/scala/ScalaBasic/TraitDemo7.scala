package ScalaBasic

// https://www.youtube.com/watch?v=rbOubS9kKH0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=99

object TraitDemo7 extends App {
  // run
  /* "composition" trait will
   *  1. TRAIT create is from left to right (-->) ( same ss class Inherence)
   *  2. METHOD execute from the trait from right to left (<---)
   *  3. if there is a "super" prefix, scala will keep finding its "parent" method, and execute the "parent" method till there is no "parent" method
   */

  // 1) TRAIT create
  // MySQL4 -> DB4 -> File4
  // File4 : extends from Data4, and Data4 extends from Operate4
  // DB4 : extends from Data4, and Data4 extends from Operate4
  // -> it will show : Operate4 -> Data4 -> DB4 -> File4  (will pass the trait if already used)
  val mysql = new MySQL4 with DB4 with File4

  println("================")

  // 2) METHOD execute
  // File4 : (but for super.insert(id), it needs to trace its parent, and implement the method, when there is no parent anymore
  // DB4 : (but for super.insert(id)....
  // MySQL4 : (but for super.insert(id)...
  mysql.insert(100)

}

class MySQL4{}

trait Operate4 {
  println("Operate4 ...")
  def insert(id: Int)
}

trait Data4 extends Operate4 {
  println("Data4")
  override def insert(id: Int): Unit = {
    println("(Data4) insert data = " + id)
  }
}

trait DB4 extends Data4 {
  println("DB4")

  override def insert(id: Int): Unit = {
    println("(DB4) to DB")
    super.insert(id)
  }
}

trait File4 extends Data4 {
  println("File4")
  override def insert(id: Int): Unit = {
    println("(File4) to doc")
    super.insert(id)
  }
}

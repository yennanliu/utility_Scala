package ScalaBasic

// https://www.youtube.com/watch?v=rbOubS9kKH0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=99

object TraitDemo6 extends App {
  // trait implement the abstract method via "trait dynamic mixing"
  val b = new BBB_6 with Operate_6 {
    override def sayOK(): Unit = {
      println("BBB_6 's say OK")
    }
  }
  // run
  b.sayOK()
}


abstract class BBB_6 {
  def sayOK()
}

trait Operate_6 {
  def insert(id: Int): Unit = {
    println("insert data :" + id)
  }
}
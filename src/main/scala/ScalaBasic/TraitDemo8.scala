package ScalaBasic

// https://www.youtube.com/watch?v=7pp9g6EEXlg&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=100

object TraitDemo8 extends App {
  // run
  val mysql = new MySQL5 with DB5 with File5
  mysql.insert(123)
}

class MySQL5{}

trait Operate5 {
  println("Operate5 ...")
  def insert(id: Int)
}

trait Data5 extends Operate5 {
  println("Data5")
  override def insert(id: Int): Unit = {
    println("(Data5) insert data = " + id)
  }
}

trait DB5 extends Data5 {
  println("DB5")

  override def insert(id: Int): Unit = {
    println("(DB5) to DB")
    super.insert(id)
  }
}

trait File5 extends Data5 {
  println("File5")
  override def insert(id: Int): Unit = {
    println("(File5) to doc")

    /** user its "direct parent's" (Data5) insert method (can only put "direct parent" in generic type )*/
    super[Data5].insert(id)

    //super[Operate5].insert(id)   // <-- this one will not work
  }
}



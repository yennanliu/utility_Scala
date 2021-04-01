package ScalaBasic

// https://www.youtube.com/watch?v=Sb_agME5ncE&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=112

object Implicit_3 extends App {
  // run

  // create a implicit func
  //  -> let MySQL can use DB method
  /*
   *   1) addDel is a implicit func
   *   2) mysql: MySQL : need to transform dtype
   *   3) DB : the expected output (transformed) dtype
   *   4) in low level :
   *        -> addDel(mysql : MySQL) DB will be generated
   */
  implicit def addDel(mysql: MySQL): DB = {
    new DB
  }


  val mysql_ = new MySQL
  mysql_.insert()
  mysql_.delete()  // now MySQL can use delete method thanks to implicit func (addDel)
}

class MySQL{
  def insert(): Unit = {
    println("MySQL insert")
  }
}

class DB{
  def delete(): Unit = {
    println("DB delete")
  }
}
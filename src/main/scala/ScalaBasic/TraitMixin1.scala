package ScalaBasic

// https://www.youtube.com/watch?v=UL0kERWHLt0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=98

object TraitMixin1 extends App {
  // run
  // this is the "Mixin" (new OracleDB with Operator3)
  val oracleDB = new OracleDB with Operator3
  oracleDB.insert(777)
}


trait Operator3 {
  def insert(id: Int): Unit = {
    println("insert value = " + id)
  }
}

class OracleDB {

}


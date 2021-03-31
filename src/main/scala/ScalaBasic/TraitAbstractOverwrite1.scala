package ScalaBasic

/*
 *   THE ORDERING OF TRAIT MIXIN IS MATTER (especially there is a super call)
 */

// https://www.youtube.com/watch?v=rttB-UZ96aA&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=109

object TraitAbstractOverwrite1 extends App {
  // run
  // need to consider "ordering" when mixin trait
  val mysql_ = new MySQL5 with DB5_
  mysql_.insert(100)

  // below will get error, since there is a super.insert(id) in File5_, but there is no such implementation in its parent trait (Operator5_)
  //val mysql_2 = new MySQL5 with File5_

  // below will get error as well, -> has insert and  super.insert(id) on the same time
  //  val mysql_3 = new MySQL5 with File5_ with DB5_
  //  mysql_3.insert(200)

  // below is OK, the calling ordering : File5_ -> DB5_ -> MySQL5
  // super.insert(id) in File5_ will caLL insert(id) in DB5_, so it's OK
  val mysql_4 = new MySQL5 with DB5_ with File5_
  mysql_4.insert(200)

}

trait Operator5_ {
  def insert(id: Int) // abstract method
}

trait File5_ extends Operator5_ {
  // use abstract override to overwrite abstract method
  abstract override def insert(id: Int): Unit = {
    println("File5_ 's Operator5")
    super.insert(id)
  }
}

trait DB5_ extends Operator5_ {
  override def insert(id: Int): Unit = {
    println("DB5_ 's Operator5")
  }
}
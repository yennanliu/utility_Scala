package ScalaBasic

// https://www.youtube.com/watch?v=zsbQ2HSxuMc&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=133

object FlatMapDemo_1 extends App {

  def upper(s: String): String = {
    s.toUpperCase
  }

  val names = List("alice", "Bob", "emmy")

  println(names.map(upper))

  // flat map will go to every sub group in a group and map the operation on each of them
  // then return the result
  println(names.flatMap(upper))
}

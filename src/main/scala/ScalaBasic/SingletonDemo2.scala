package ScalaBasic

// https://www.youtube.com/watch?v=en-FcYKclns&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=92

object SingletonDemo2 extends App {

  // run
  println(SingletonDemo01.name) // SingletonDemo01$.MODULE$ ...
  println(SingletonDemo01.count())
}

// when running, scala will use  SingletonDemo01$.MODULE$ instance
// the Singleton
object SingletonDemo01 {
  // attribution
  var name: String = "iori";

  // method
  def count(): Unit = {}
}

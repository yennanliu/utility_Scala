package ScalaBasic

// https://www.youtube.com/watch?v=ubjjmK61RH4&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=134

object Filter_demo1 extends App {
  // run
  val names = List("Alice", "Jack", "Kyo")

  def startA(s: String): Boolean = {
    s.startsWith("A")
  }

  // will keep the element if startA return true
  val names_r = names.filter(startA)
  println("names_r = " + names_r)
}

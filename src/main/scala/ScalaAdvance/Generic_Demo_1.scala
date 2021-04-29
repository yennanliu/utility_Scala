package ScalaAdvance

// https://www.youtube.com/watch?v=b2mdNwAB-Oc&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=144

// define a class Pair[T,S]. and with a swap method that can switch t,s
// t, s will become Pairs class's read-only attr
final class Pair[T,S](val t: T, val s: S){
  // swap method will make (s,t) to (t,s)
  def swap() = {
    new Pair(s,t)
  }
}

object Generic_Demo_1 extends App {
  // run
  // example 1
  // declare generic type explicitly
  val pair = new Pair[String, Int]("tim", 888)
  println("pair.t = " + pair.t + " pair.s = " + pair.s)

  val pair2 = pair.swap()
  println("pair2.t = " + pair2.t + " pair2.s = " + pair2.s)

  println("================")

  // example 2
  // or, you can not to declare generic type explicitly
  val pairx = new Pair("tim", 888)
  println("pairx.t = " + pairx.t + " pairx.s = " + pairx.s)

  val pairx2 = pair.swap()
  println("pairx2.t = " + pairx2.t + " pairx2.s = " + pairx2.s)
}

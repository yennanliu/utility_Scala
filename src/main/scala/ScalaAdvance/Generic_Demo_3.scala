package ScalaAdvance

// https://www.youtube.com/watch?v=b2mdNwAB-Oc&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=144

// define a class Pair[T]. and with a swap method that can switch elements (t,s)
// Note : the generic type now is [T] (rather than [T,S])
final class Pair_03[T](val t: T, val s: T){
  // swap method will make (s,t) to (t,s)
  def swap() = {
    new Pair_03(s,t)
  }
}

object Generic_Demo_3 extends App {

  // run
  val pair = new Pair_03[String]("tim", "may")
  val pair2 = pair.swap()
  println("pair2.t = " + pair2.t + " pair2.s = " + pair2.s)

}

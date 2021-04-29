package ScalaAdvance

// https://www.youtube.com/watch?v=b2mdNwAB-Oc&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=144

// given a Pair[T,S], define a generic method that switch elements (t,s)
// and also make swap as generic method
final class Pair_04[T,S](val t: T, val s: S){
  // swap as generic method
  def swap[T,S](t:T, s:S) = {
    new Pair_04(s,t)
  }
}

object Generic_Demo_4 extends App {
  // run
  val pair1 = new Pair_04[String, Double]("terry", 777.787)
  val pair2 = pair1.swap(pair1.t, pair1.s)
  println("pair2.t = " + pair2.t + " pair2.s = " + pair2.s)
}

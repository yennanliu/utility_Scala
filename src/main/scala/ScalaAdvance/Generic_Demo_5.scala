package ScalaAdvance

// https://www.youtube.com/watch?v=b2mdNwAB-Oc&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=144

// given a Pair[S,T], make the swap method that ONLY switch (t,s) if S, T are in the same type
class Pair_05[T,S](val t: T, val s: S){
  // implicit env: S =:= T will been called by default (since it's is "implicit")
  // S =:= T means S and T are in the same type
  def swap(implicit env: S =:= T) = new Pair_05(s,t)
}

object Generic_Demo_5 extends App {
  // run
  // note : only works if T and S are in the same type (implicit env: S =:= T)
  val pair1 = new Pair_05[String, String]("jim", "oooooooooo")
  val pair2 = pair1.swap

  println("pair2.t = " + pair2.t + " pair2.s = " + pair2.s)
}

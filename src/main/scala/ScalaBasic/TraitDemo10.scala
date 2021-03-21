package ScalaBasic

// Compare the ordering with trait construct ways
// way 1) create class instance -> class hasn't been created yet when mixing trait
// way 2) create "anonymous" sub class -> class already been created when mixing trait

// https://www.youtube.com/watch?v=CWf53hZwdUQ&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=102
// https://www.youtube.com/watch?v=CWf53hZwdUQ&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=102

object TraitDemo10 extends App {
  // way 1

  /*
   * 1) class can also extend class with trait
   * 2) the set up ordering : parent class -> class -> trait's "Highest" father trait -> last father trait -> ... -> trait
   * 3) ordering in below example :  E -> A -> B -> C -> D -> F
   */
  val f = new FF

  println("===================")

  // way 2

  /*  1) Construct an "anonymous" sub class actually
   *  2) ordering : E -> K -> A -> B -> C -> D
   */
  val f2 = new KK with CC with DD

}

trait AA {
  println("A ...")
}

trait BB extends AA{
  println("B ...")
}

trait CC extends BB{
  println("C ...")
}
trait DD extends BB{
  println("D ...")
}

class EE {
  println("E ...")
}

class FF extends EE with CC with DD {
  println("F ...")
}

class KK extends EE {
  println("K ...")
}

package ScalaAdvance.CovariantContravariantInvariant

// https://www.bilibili.com/video/BV12N411R726?p=281

/**
 *  Covariant Contravariant Invariant demo 1
 *
 *  Regards Scala generic types (as below cases):
 *  1) `+` : Covariant (協變)
 *   -> C[+T]: if A is B's sub class,
 *   -> then if C[A] is C[B]'s sub class ->  Covariant
 *
 *  2) `-` : Contravariant (逆變)
 *   -> C[-T]: if A is B's sub class,
 *   -> then if C[B] is C[A]'s sub class ->  Contravariant
 *
 *  3) Invariant : Whatever relation between A, and B (不變)
 *   -> if there is NO relation between C[B], C[A]
 *   -> Invariant
 *
 *   Note : In java, all generic types are Invariant
 *          e.g. : List<String> is NOT List<Object> 's sub class
 *
 *          (Only Scala has Covariant Contravariant Invariant feature)
 */

// entry point
object demo1 extends App {

  /** demo 1 : Invariant */
  var t1:tmp1[Sub] = new tmp1[Sub]("hello")

  //var t1_1:tmp1[Sub] = new tmp1[Super]("hello") // wrong, type mismatch

  //var t1_2:tmp1[Super] = new tmp1[Sub]("hello") // wrong, type mismatch

  /** demo 2 : Covariant */
  var t2:tmp2[Sub] = new tmp2[Sub]("hello")

  // this is OK. since Covariant, so "Sub" is "Super" 's sub class,
  // then tmp2[Sub] is also tmp2[Super] 's sub class
  var t2_1:tmp2[Super] = new tmp2[Sub]("hello")

  //var t2_2:tmp2[Sub] = new tmp2[Super]("hello") // wrong

  /** demo 3 : Contravariant */
  var t3:tmp3[Sub] = new tmp3[Sub]("hello")

  //var t3_1:tmp3[Super] = new tmp3[Sub]("hello") // wrong

  // this is OK. since Contravariant, so "Sub" is "Super" 's sub class,
  // then tmp2[Super] is also tmp2[Sub]  's sub class
  var t3_2:tmp3[Sub] = new tmp3[Super]("hello") // wrong
}

// Covariant
class tmp2[+A](title:String) {
  override def toString: String = {
    title
  }
}

// Contravariant
class tmp3[-A](title:String) {
  override def toString: String = {
    title
  }
}

// Invariant
class tmp1[A](title:String) {
  override def toString: String = {
    title
  }
}

// some extends for support Covariant
class Super // parent class
class Sub extends Super // sub is super's sub class
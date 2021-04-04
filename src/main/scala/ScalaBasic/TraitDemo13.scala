package ScalaBasic

// https://www.youtube.com/watch?v=fdQO6t_s8-k&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=121

object TraitDemo13 extends App {
  // run
  val a01 = new A_myTrait13
  B_trait13.test(a01)
}

trait myTrait01 {}
// class A_myTrait13 inherit from trait myTrait01
class A_myTrait13 extends myTrait01 {}

object B_trait13 {
  // this test method can accept a class instance (e.g. A_myTrait13) that inherit from myTrait01
  // as Polymorphism as java's interface
  def test(m: myTrait01): Unit = {
    println("B's test")
  }
}

package ScalaBasic

// https://www.youtube.com/watch?v=k18Ea9ko07s&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=96

object TraitDemo3 extends App {
  // run
  val c = new C
  c.getConnect("root", "123")

  val f = new F
  f.getConnect("admin", "000")
}

// trait
// make a specification that connect to DB
trait trait03_1{
  // abstract method
  def getConnect(user:String, pwd:String):Unit
}

// class
class A_a {}
class B_b extends A_a {}
class C extends A_a with trait03_1 {
  // override here is optional
  override def getConnect(user: String, pwd: String): Unit = {
    println("connect to mysql ...")
  }
}

class D {}
class E extends D {}
class F extends D with trait03_1 {
  override def getConnect(user: String, pwd: String): Unit = {
    println("connect to Oracle ...")
  }
}

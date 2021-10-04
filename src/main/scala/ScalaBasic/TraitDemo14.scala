package ScalaBasic

trait A_TraitDemo4 {
  def init(a: Int): Unit = {
    print("A")
  }
}

trait B_TraitDemo4 {
  def init(a: Int): Unit = {
    print("B")
  }
}

class C_TraitDemo4 extends A_TraitDemo4 {
  def init(): Unit = {
    print("C\n")
  }
}

class D_TraitDemo4 {
  val name:String = "123"

  def this(name:String){
    this()
    println(name)
  }

  def apply():Unit = {
    println("D apply")
  }
}

object TraitDemo14 extends App {
  println ("123")
  val d = new D_TraitDemo4("DDD")
  d()
  d.apply()
  println ("456")
}

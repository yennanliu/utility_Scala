package ScalaBasic

//https://www.youtube.com/watch?v=2ld4vi4legQ&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=77

object encapsulationDemo2 extends App {

  // run
  val b_ = new B_
  b_.sayOK()
}

class A_{
  var n1: Int = 100
  protected var n2: Int = 100
  private var n3: Int = 100 // there is no "public" in scala

  def test100(): Unit = {
    println("A test100()")
  }

  protected def test200(): Unit = {
    println("A test200()")
  }

  private def test300(): Unit = {
    println("A test300()")
  }
}

class B_ extends A_ {
  def sayOK(): Unit = {
    println("ok" + this.n1 + this.n2)
    this.test100()
    this.test200()
  }
}
package ScalaBasic

// https://www.youtube.com/watch?v=Z571AAtK9es&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=133

object HigherOrderFuncDemo_6 extends App {

  // run
  // NOTICE : don't use  test2(myPrint()), since we are not running myPrint (myPrint() means run);
  //        --> but we only want to pass the func myPrint into the higher order func test2
  test2(myPrint)

  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  // method for higher order func
  // f : no input, so  set "f: ()"
  // f : no output, so set f: () => Unit
  def test2(f: () => Unit): Unit = {
      f()
  }

  def myPrint(): Unit = {
    println("hola ! this is myPrint")
  }



}

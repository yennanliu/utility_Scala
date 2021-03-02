package ScalaBasic

object ApplyMethodDemo4 extends App {
  // run
  println("ApplyMethodDemo4 ...")
  // apply(String)
  // here we DON'T need to use myAccount.apply("test"), but can use myAccount("test") directly, thanks the apply method
  myAccount("test")
  // apply(Int)
  myAccount(123)
  // apply()
  myAccount()
}


object myAccount{
  val x = 1
  val y = 2
  var a = 0

  def hello: Unit = {
    println("hello")
  }

  def apply(x:String): Unit = {
    println("apply from input = String")
  }

  def apply(x:Int): Unit = {
    println("apply from input = Int")
  }

  def apply(): Unit = {
    println("apply without input param")
  }

}

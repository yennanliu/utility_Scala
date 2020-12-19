package ScalaBasic

object ApplyMethodDemo1 extends App{

  println("*** ApplyMethodDemo1 run ...")

  val account_1 = Account(1000.0)
  println(account_1)
  println(account_1.getClass)
  println(account_1.id)
  println(account_1.balance)
}

class Account private(val id: Int, intialBalance: Double){
  // private var balance = intialBalance // if private, then "balance" is not callable
  var balance = intialBalance
}

object Account { // Companion
  def apply(intialBalance: Double) ={
    new Account(123, intialBalance)
  }
}

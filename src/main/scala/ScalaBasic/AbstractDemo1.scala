package UtilityScala

// create a class : Account that includes constructor, method
// https://www.youtube.com/watch?v=J_e9mpBV1SI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=73

object AbstractDemo1 extends App {

  // run
  val account1 = new Account("A0001", 100, 123)
  account1.query(123)
  account1.withdraw(123, 20)

  account1.query(789)
  account1.withdraw(789, 20)

  account1.withdraw(123, 1000)
}

class Account (InAccountNo:String, InBalance:Double, inPwd:Int){
  // constructor
  val accountNo:String = InAccountNo
  var balance:Double = InBalance
  var password:Int = inPwd

  // method
  def query(pwd: Int): Unit = {
    if (pwd != this.inPwd){
      // if password is wrong
      println("password wrong !")
      return
    }
    // if password is correct
    println("login success !")
    println(s"this accountNo  = $accountNo has balance : $balance")
  }

  def withdraw(pwd: Int, money: Double): Unit = {
    if (pwd != this.inPwd) {
      // if password is wrong
      println("password wrong !")
      return
    }
    // if withdraw > balance
    if (money > this.balance){
      println("balance is not enough")
      return
    }
    // if password is correct
    this.balance = this.balance - money
    println("withdraw success !")
    println(s"this accountNo  = $accountNo has balance : $balance")
  }

  // TODO : transaction
}


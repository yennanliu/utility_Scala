package ScalaBasic

object TraitDemo extends App {
    trait Loggger{
        def log(msg: String)
    }

    // extends the trait here
    class ConsoleLogger extends Loggger {
        def log(msg: String): Unit = {println(msg)}
    } 

    val x = new ConsoleLogger
    println(x.log("123"))

    // ConsoleLogger can be a trait as well
    trait ConsoleLogger2 {
        def log2(msg: String): Unit = {println(msg)}
    } 

    // // extend above trait (ConsoleLogger2)
    // class SavingsAccount extends Account with ConsoleLogger2{
    //     def withdraw(amount: Double, balance: Double): Unit = {
    //         if (amount > balance) log("insufficienct fund")
    //         else balance = balance - amount
    //     }

    // }

    // can also add different traita when declare a value
    val y = new ConsoleLogger with ConsoleLogger2
    println(y.log("helloworld"))
    println(y.log2("helloworld"))

}
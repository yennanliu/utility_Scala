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

}
package ScalaBasic

object Implicit_Demo2 extends App{

    println("Implicit_Demo2 run ...")

    // define ur own case class
    case class Printable(content:String)

    implicit val myFirstImplicitString:Printable = Printable("hello world implict !!!!!")

    def printImplict() (implicit printable:Printable): Unit = {
        println("printImplict run ...")
        println(printable.content)
    }

    // run
    printImplict()
}
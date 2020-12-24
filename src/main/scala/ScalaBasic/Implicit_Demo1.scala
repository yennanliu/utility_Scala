package ScalaBasic

object Implicit_Demo1 extends App{

    println("Implicit_Demo1 run ...")

    implicit val myFirstImplicitString:String = "hello world implict !!!!!"

    def printImplict() (implicit toPrint:String): Unit = {
        println("printImplict run ...")
        println(toPrint)
    }

    // run
    printImplict()
}
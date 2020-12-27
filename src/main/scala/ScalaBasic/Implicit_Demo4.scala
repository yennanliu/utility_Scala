package ScalaBasic

object Implicit_Demo4 extends App{

    println("Implicit_Demo4 run ...")

    implicit val myImplicitStr_1:String = "this is myImplicitStr_1"
    implicit val myImplicitInt_1:Int = 123
    implicit val myImplicitBoolean_1:Boolean = true

    // define ur own case class
    case class MyStyle(content:String)
    implicit val myImplicitString:MyStyle = MyStyle("hey this is my way ~~~~")

    def printImplictStr() (implicit toPrint:String): Unit = {
        println("printImplict run ...")
        println(toPrint)
    }


    def printImplictInt() (implicit toPrint:Int): Unit = {
        println("printImplictInt run ...")
        println(toPrint)
    }


    def printImplictBoolean() (implicit toPrint:Boolean): Unit = {
        println("printImplictBoolean run ...")
        println(toPrint)
    }

    def printImplictMyStyle() (implicit toPrint:MyStyle): Unit = {
        println("printImplictMyStyle run ...")
        println(toPrint)
    }

    // run
    printImplictStr()
    printImplictInt()
    printImplictBoolean()

    printImplictMyStyle()
}
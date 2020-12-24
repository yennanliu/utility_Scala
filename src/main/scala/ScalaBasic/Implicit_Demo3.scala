package ScalaBasic

object Implicit_Demo3 extends App{

    println("Implicit_Demo3 run ...")

    // define a func
    def myTestFunc[T](input:T)(implicit myPrint: myImplicits.MyPrint[T]): Unit = {
        myPrint.print(input)
    }

    // run
    myTestFunc(999)
    myTestFunc("good day!")
    myTestFunc(false)
}

// define object
package object myImplicits{
    // define the trait
    trait MyPrint[T]{
        def print(toPrint:T): Unit
    }

    // let's make some implicit on the trait!
    implicit val intMyPrint:MyPrint[Int] = new MyPrint[Int] {
        override def print(toPrint: Int): Unit = 
            println("this is intMyPrint !!!")
    }

    implicit val StringMyPrint:MyPrint[String] = new MyPrint[String]{
        override def print(toPrint: String): Unit = 
            println("this is StringMyPrint !!!")
    }

    implicit val booleanMyPrint:MyPrint[Boolean] = new MyPrint[Boolean]{
        override def print(toPrint:Boolean): Unit = {
            println("this is booleanMyPrint !!!")   
        }
    }
}
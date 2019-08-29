object FunctionCompositionDemo{

    def main(args: Array[String]) = {
        var result = multiply2(add2(100))
        println(result)
        printMe()
    }

    def add2(a:Int):Int={
        a + 2 
    }

    def multiply2(a:Int):Int={
        a*2 
    }

    def printMe(): Unit={       // if no any return, use Unit, similar as void in Java 
        println("Helo Scala!")
    }

}
object FunctionCompositionDemo{

    def main(args: Array[String]) = {
        var result = multiply2(add2(100))
        println(result)
    }

    def add2(a:Int):Int={
        a + 2 
    }

    def multiply2(a:Int):Int={
        a*2 
    }

}
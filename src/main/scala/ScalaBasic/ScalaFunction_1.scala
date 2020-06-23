package ScalaBasic

object ScalaFunction_1{

    def main(args: Array[String]){

        // 1) funciton 
        def squareIt(x:Int) : Int = {
            x * x 
        }
        // this form works OK as well
        // def squareIt(x:Int) = {
        //     x * x 
        // }

        def cubeIt(x:Int) : Int = {
            x * x * x
        }

        println(squareIt(2))
        println(cubeIt(2))

        // 2) funciton take another funciton as input
        def transformInt(x:Int, f: Int=>Int) : Int = { 
            f(x)
        }

        val result1 = transformInt(2, squareIt)
        val result2 = transformInt(2, cubeIt)
        println(result1)
        println(result2)

        transformInt(2, x => {val y = x * 2; y * y}) // input lambda function to function 
        transformInt(2, x => {val y = x ; y + 100 }) // input lambda function to function 
        transformInt(10, x => x / 2)  // input lambda function to function 

    }
}
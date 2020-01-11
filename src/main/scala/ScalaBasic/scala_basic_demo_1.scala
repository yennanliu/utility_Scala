
package ScalaBasic

object scala_basic_demo_1{

    def main(args: Array[String]){

        // `1) if-else
        if (1 > 3) println("Impossible!") else println("The world makes sense.") 

        if (1 > 3) { 
            println("it's Impossible") 
            }  else { println("make sense") }
        
        // 2) Matching - like switch in other languages
        val y = 3 
        y match {

            case 1 => println("one")
            case 2 => println("two")
            case 3 => println("three")
            case _ => println("sth else") // other case
        }

        // 3) For loop 
        var x = 10 
        while (x > 0){
            println(x)
            x -= 1 
        }

        var z = 0 
        do { println(z); z += 1} while (z <= 10)


        //4)  "Returns" the final value in a block automatically
        {var u = 10; u + 20}
        println({val u = 10; u + 20})  

    }
}

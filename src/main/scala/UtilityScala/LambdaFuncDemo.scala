// Scala program to show 
// working of lambda expression 

// Creating object 
object LambdaFuncDemo 
{ 
    
    // Main method 
    def main(args:Array[String]) 
    { 
        // lambda 1 : lambda expression 
        val ex1 = (x:Int) => x + 2

        // lambda 2 : with multiple parameters 
        val ex2 = (x:Int, y:Int) => x * y 

        // lambda 3 : print some random stuff
        val ex3 = (x:Int) => "this is lambda demo"
     
        // lambda 4 : squaring each element of the list 
        val func1  = (x:Int) => x * x 

        // lambda 5 : lambda as parameter to func  
        def transform1( x:Int, f:Int => Double)  = f(x) 

        // lambda 6 :  using map function to apply transformation defined by f to every element of the list l.
        def transform2( l:List[Int], f:Int => Double) = l.map(f) 

        println(">>>>> output of lambda func 1")
        println(ex1(7)) 

        println(">>>>> output of lambda func 2")
        println(ex2(2, 3)) 

        println(">>>>> output of lambda func 3")
        println(ex3(99)) 

        println(">>>>> output of lambda func 4")
        // list of numbers 
        val l1 = List(1, 1, 2, 3, 5, 8)  
        val res1 = l1.map( func1 ) 
        println(res1) 

        println(">>>>> output of lambda func 5")
        val res2 = transform1(2, r => 3.14 * r * r) 
        println(res2) 

        println(">>>>> output of lambda func 6")
        val res3 = transform2(List(1, 2, 3), r => 3.14 * r * r) 
        println(res3) 
        } 
} 

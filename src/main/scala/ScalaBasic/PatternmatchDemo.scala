package ScalaBasic

object PatternmatchDemo extends App{
    // example 1
    val data = List("jim", 100, 3.1416, "abc")
    for ( i <- data)     
        i  match {
            case x: String => println("String")
            case x: Int => println("Int") 
            case x: Float => println("float")
            case _ => println("else")
        }

    // example 2
    val data2 = List("1", 100, 3.1416, "abc", 1,2,3,4,5, -1,-2,-3,-4,-5,0)
    var sign = 0
    var digit = 0  
    for ( i <- data2)    
        i  match {
            case '+' => sign = 1
            case '-' => sign = -1
            //case _ if i.isDigit() => i  // to fix
            case _ => sign = 0
        }

}
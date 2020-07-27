package ScalaBasic

object EnumerationDemo extends App{

    object TrafficColor extends Enumeration {
        val red, yellow, green = Value
        // same as below :
        // val red = Value
        // val yellow = Value
        // val green = Value
    }

    object MyColor extends Enumeration {
    val red = Value(0, "stop")
    val yellow = Value(10)
    val green = Value("go")
    }

    // test
    println(TrafficColor)
    println(MyColor)

    for ( c <- TrafficColor.values)
        println( c.id + ": " + c)


    for ( c <- MyColor.values)
        println( c.id + ": " + c)

}
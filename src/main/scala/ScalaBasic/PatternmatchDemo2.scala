package ScalaBasic

object PatternmatchDemo2 extends App{
    // example 1
    val data = 201
    println(s"data = $data")
    data match {
        case 201 => true
        case _ => false
    }

    // example 2
    def CheckHttpStatusCode(statusCode: Int): Boolean = statusCode match {
        case 201 => true
        case _ => false
    }

    println(CheckHttpStatusCode(201))
    println(CheckHttpStatusCode(500))
    println(CheckHttpStatusCode(400))

    // example 3 
    def CheckValues(x: Int, y: Int): Boolean = (x + y) match {
        case 100 => true
        case _ => false
    }

    println(CheckValues(100, 0))
    println(CheckValues(1, 0))
    println(CheckValues(200, -100))
}
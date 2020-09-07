package ScalaBasic

// case class is also one kinds of class, the difference is 
// case class is matching input parameter type at beginning

// https://openhome.cc/Gossip/Scala/CaseClass.html
// https://ithelp.ithome.com.tw/articles/10188670

object CaseClass2 extends App{

    // example 1
    case class Point(x: Int, y: Int)
    val p = Point(1, 2)
    println("(" + p.x + ", " + p.y +")")

    // example 2 
    def go(p: Point) = p match {
        case Point(0, 0) => "starting point"
        case Point(10, 10) => "end point"
        case _ => "on moving...." + p
    }

    println(go(Point(0, 0)))
    println(go(Point(0, 1))) 
    println(go(Point(2, 3))) 
    println(go(Point(10, 10))) 

    // example 3
    case class Point2(x: Int, y: Int)
    case class Circle2(p: Point2, r: Int)

    def what(c: Circle2) = c match {
        // don't care r, only compare x, y
        case Circle2((Point2(0, 0)), _) => "starting point Circle"
        case Circle2(Point2(10, 10), _) => "end point Circle"
        case _ => "other Circle"
    }

    println(what(Circle2(Point2(0, 0), 10)))
    println(what(Circle2(Point2(10, 0), 10)))
    println(what(Circle2(Point2(5, 5), 30)))

    // example 4
    abstract class Amount
    case class Dollar(value : Double) extends Amount
    case class Currency(value: Double, unit: String) extends Amount
    case object Nothing extends Amount

    val currency = Currency(20, "USD")
    println(currency.value)
    println(currency.unit)

    def amtMatch(amt: Amount): Any = amt match {
        case Dollar(value) => "$" + value
        case Currency(value, unit) => value + ", and unit is " + unit
        case Nothing => ""
    }

    println(amtMatch(Dollar(20)))
    println(amtMatch(Currency(30, "NT")))
    println(amtMatch(Nothing))

}
package ScalaBasic

// https://www.youtube.com/watch?v=nBc4ap41xyg&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=21

object Nothing_demo2 extends App {

    // will get error : ession of type Null is ineligible for implicit conversion
    // val n1:Int = null
    //println("n1 = " + n1)


    // null can be passed to AnyRef, but NOT AnyValue
    // AnyValue : Int, Float, Char, Boolean, Long, Double, Byte, short...
    var cat = new Cat()
    cat = null

    println(cat)

    class Cat {

    }
}
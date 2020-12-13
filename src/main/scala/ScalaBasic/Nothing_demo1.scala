package ScalaBasic

// https://www.youtube.com/watch?v=nBc4ap41xyg&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=21

object Nothing_demo1 extends App {

    val t = null
    println(t)

    println(test())

    println(test2())

    def test():Nothing = {
        // throw an exception
        throw new Exception()
    }

    def test2():Any = {
        // throw an exception
        throw new Exception()
    }

}
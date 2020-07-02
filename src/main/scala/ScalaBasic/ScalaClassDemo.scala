package ScalaBasic


object ScalaClassDemo{

    class Counter{
        private var value = 0 
        def increment(): Unit = {value += 1}
        def current() = value
    }

    def main(args: Array[String]){ 
        val myCounter = new Counter // or new Counter()
        myCounter.increment()
        println(myCounter.current())

    }
}
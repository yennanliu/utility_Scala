package ScalaBasic

object runTimeElapse_demo1 extends App{

    def show_timing[T](proc: => T): T = {
        val start=System.nanoTime()
        val res = proc // run the code
        val end = System.nanoTime()
        println("Time elapsed: " + (end-start)/1000 + " microsecs")
        res
    }

    // example 1 
    val x = 123
    val r_1 = show_timing(x)
    println(r_1)

    // example 2
    val r_2 = show_timing(List(1,2,3,4,5))
    println(r_2)


    // example 3
    def sleep_func:Unit = {
        println("sleep_func run...")
        Thread.sleep(1000)
    }
    show_timing(sleep_func)
}
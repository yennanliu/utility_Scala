package ScalaBasic.controlAbstract1

// https://www.youtube.com/watch?v=wxF1PWk7U4E&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=173

object demo2 extends App {
  // run 1
  var x = 10
  /**
   *  1) until is the method that we define below
   *  2) condition : (x == 0)
   *  3) block : x -= 1; println("x = " + x)
   *
   */
  until(x == 0){
    x -= 1
    println("x = " + x)
  }

  def until(condition: => Boolean)(block: => Unit): Unit = {
    // condition, block are 2 methods
    // can implement sth similar to while loop
    if (!condition) { // if condition = false -> run block
      block
      until(condition)(block)  // recursively call until method
    }

    // easier version
    //    println("x = " + x)
    //    println(condition) // run condition method
    //    block // run block
    //    println("x = " + x)
  }

}

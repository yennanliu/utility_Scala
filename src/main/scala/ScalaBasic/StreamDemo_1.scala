package ScalaBasic

// https://www.youtube.com/watch?v=cJAJ9Ou2840&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=140

object StreamDemo_1 extends App {

  /**
   *  1) below Stream uses BigInt as dtype
   *  2) the first element is n, and the following elements are : n+1, n+2 ...
   *  3) we can define the above rules by ourself. e.g. : numForm(n+4)
   *  4) #::  means "combine"
   */
  def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n+1)

  val stream1 = numsForm(1)
  println("stream1 = " + stream1) // stream1 = Stream(1, ?)

  // if we want one more element
  stream1.tail
  println("stream1 = " + stream1) // stream1 = Stream(1, 2, ?)

  // get the 1st element in stream
  println("stream1.head =  = " + stream1.head)  // stream1.head =  = 1

  // but below command will cause "endless loop", since stream is designed for endless collection
  //println("stream1.last =  = " + stream1.last)

  println("===========================")

  // let's do some calculation with stream
  def multi(x: BigInt): BigInt = {
    x * x
  }

  println(numsForm(5).map(multi)) // Stream(25, ?)
  println(stream1.map(multi)) // Stream(1, ?)
}

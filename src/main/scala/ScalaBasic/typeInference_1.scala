package ScalaBasic

// https://www.youtube.com/watch?v=86CQ8rCFZQ4&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=168

object typeInference_1 extends App {
  val l1 = List(1,2,3,4)

  /**
   *  Example 1 : normal way
   *  -> pass an anonymous func to map
   *
   *  scala can infer the element type in list is int, so it (element type) can be neglected
   */

   println(l1.map((x) => x+1))

  /**
   *  Example 2 :
   *  -> () can be neglected since there is only 1 parameter there
   */

   println(l1.map(x => x+1))

  /**
   *  Example 3 :
   *  -> x can be neglected since it only shows ONCE (1 time)
   */

   println(l1.map(_ + 1))

   println("==========================")

  // get list element sum
  /**
   *  Example 4 :
   *
   *  reduceLeft get 2 arguments
   *    -> we use (_ + _) below
   */

   println(l1.reduceLeft(_ + _))

}

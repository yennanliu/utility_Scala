package ScalaBasic.PartialFunc_1

// https://www.youtube.com/watch?v=hdty_dtNfCY&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=163

object Test extends App {

  /**
   * Question 1 :
   *    given a list : List(1,2,3,4, "abc")
   *    make every element + 1, and return it
   *   -> the expected result : List(2,3,4,5)
   */

  val l1 = List(1,2,3,4, "abc")

  // Approach 1 : via map (not working)
  // it's not working (return List(2, 3, 4, 5, ()))
  // since map needs to for loop every element in list
  // we need to have cases that can pattern match every possible case -> impossible
  def addOne(x: Any):Any = x match {
    case x:Int => x +1
    case _ =>
  }

  val a1 = l1.map(addOne) //l1.map(x => addOne(x))
  println(a1) //List(2, 3, 4, 5, ())

  // Approach 2 : partial func (working)
  /**
   * Partial func
   *  1) can match some conditions, but not do logic operation for every conditions
   *  2) pattern : {case ...}
   *  3) can only do op in specific cases or defined variable type
   *  4) In scala, Partial func is the subclass of trait : PartialFunction
   */

   /**
    * 1) addOne_2 is a Partial func
    * 2) via trait PartialFunction
    * 3) [Any, Int]
    *    -> accept input as Any type
    *    -> return output as Int type
    * 4) method isDefinedAt(any: Any) accept input with any type
    *    -> if isDefinedAt(any: Any) is true -> IT WILL CALL apply METHOD (to make an instance and return apply's result)
    *    -> if isDefinedAt(any: Any) is false -> WILL NOT CALL apply (neglect the given input)
    */
   val addOne_2 = new PartialFunction[Any, Int] {

     override def isDefinedAt(any: Any): Boolean = {
       if (any.isInstanceOf[Int]) true else false
     }

     override def apply(any: Any) = {
       any.asInstanceOf[Int] + 1
     }
   }

  // run
  val a2 = l1.collect(addOne_2) // note : Map not support partial func, so here we use collect
  println("a2 = " + a2)
}

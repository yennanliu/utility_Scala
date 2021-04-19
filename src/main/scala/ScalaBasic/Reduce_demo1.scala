package ScalaBasic

// https://www.youtube.com/watch?v=5A2ENMkm_v4&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=134

object Reduce_demo1 extends App {

  val list_1 = List(1, 20, 30, 4, 5)

  // a func return sum of two integer
  def my_sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }

  /** reduceLeft */
  // step 1):  1, 20, 30, 4, 5
  // step 2): (1,20), 30, 4, 5
  // step 3): (21, 30), 4, 5
  // step 4): (51, 4) 5
  // step 5): (55, 5)
  // step 6): 60
  val res1 = list_1.reduceLeft(my_sum) // override def reduceLeft[B >: A](f: (B, A) => B): B
  println("res1 = " + res1)

  val res1_1 = list_1.reduceLeft(_ + _) // override def reduceLeft[B >: A](f: (B, A) => B): B
  println("res1_1 = " + res1_1)

  println("=================")

  /** reduceRight */
  // step 1):  1, 20, 30, 4, 5
  // step 2): 1, 20, 30, (4, 5)
  // step 3): 1, 20, 30, (30. 9)
  // step 4): 1, (20, 39)
  // step 5): (1, 59)
  // step 6): 60
  val res2 = list_1.reduceRight(my_sum)
  println("res2 = " + res2)

  val res2_1 = list_1.reduceRight(_ + _)
  println("res2_1 = " + res2_1)
  
  val res2_2 = list_1.reduceRight(_ - _)
  println("res2_2 = " + res2_2)

  println("=================")

  /** reduce */
  // def reduce[A1 >: A](op: (A1, A1) => A1): A1
  // --> reduce get 2 inputs, and return A1 for next op
  val list_1_r2 = list_1.reduce(my_sum)
  println("list_1_r2 = " + list_1_r2)
}

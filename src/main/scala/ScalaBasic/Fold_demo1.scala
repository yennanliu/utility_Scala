package ScalaBasic

// https://www.youtube.com/watch?v=_v7JvxFI1Ts&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=136

object Fold_demo1 extends App {

  val list1 = List(1,2,3,4)
  def minus(num1: Int, num2: Int): Int = {
    num1 - num2
  }

  /** foldLeft */
  // step 1) 5,1,2,3,4
  // step 2) (5,1) ,2,3,4
  // step 3) (4,2) ,3,4
  // step 4) (2,3),4
  // step 5) (-1,4)
  // step 6) -5
  println(list1.foldLeft(5)(minus))

  // we can use /: as foldLeft shortcut
  println( (5 /:list1)(minus) )

  println("=============")

  /** foldRight */
  // step 1) 1,2,3,4, 5
  // step 2) 1,2,3, (4, 5)
  // step 3) 1,2,(3,-1)
  // step 4) 1,(2,4)
  // step 5) (1,-2)
  // step 6) 3
  println(list1.foldRight(5)(minus))

  // we can use :\ as foldLeft shortcut
  println( (list1 :\5)(minus) )
}

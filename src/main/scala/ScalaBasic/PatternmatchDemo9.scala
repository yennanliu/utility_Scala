package ScalaBasic

// https://www.youtube.com/watch?v=9W5EShCF7ac&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=152

object PatternmatchDemo9 extends App {
  for (list <- Array(List(0), List(1,0), List(0,0,0), List(1,0,0), List(777))) {
    val result = list match {
      case 0 :: Nil => "0" // 0 :: Nil -> List(0), compare List(0)
      case x :: y :: Nil => s"x = $x, y = $y"  // x :: y :: Nil -> List(x,y),  compare array with 2 elements
      case 0 :: tail => "0 ..." //  compare array start from 0, element counts can be any value
      case x :: Nil => x :: Nil // compare array with ONLY 1 element, and also return the original list (x :: Nil)
      case _ => "something else"
    }

    println(s"list = $list  |  result = $result")
  }

}

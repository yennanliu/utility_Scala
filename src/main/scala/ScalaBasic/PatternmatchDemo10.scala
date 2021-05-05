package ScalaBasic

// https://www.youtube.com/watch?v=TfPWLOiTLF0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=152

object PatternmatchDemo10 extends App {
  for (pair <- Array((0,1), (1,0), (1,1), (1,0,2), (99,98))){
    val result = pair match {
      case (0, _) => "0 ..." // compare tuple start from 0 (length = 2)
      case (y,0) => y // compare tuple that end with 0 (length = 2)
      case (x,y) => s"x = $x, y = $y"
      case _ => "other"
    }
    println(s"pair = $pair  |  result = $result")
  }
}

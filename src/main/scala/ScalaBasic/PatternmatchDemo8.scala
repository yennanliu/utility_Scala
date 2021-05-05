package ScalaBasic

/**
 *  Pattern match : Array
 */

// https://www.youtube.com/watch?v=_6iXn8w3X-g&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=151

object PatternmatchDemo8 extends App {
  for (arr <- Array(Array(0), Array(1,0), Array(0,1,0), Array(1,1,0), Array(1,1,0,1), Array("xxx", "yyy"))) {
    val result = arr match  {
      case Array(0) => "0"  // compare Array(0)
      case Array(x, y) => s"x = $x, y = $y" // compare array with 2 elements, and set 1st element as x, 2nd element as y
      case Array(0, _*) => "Array start from 0" // compare array start from 0, length can be anything
      case _ => "not a collection"
    }

    println(s"arr = ${arr.toList}  |  result = $result")
  }

}

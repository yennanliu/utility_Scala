package ScalaBasic

// https://www.youtube.com/watch?v=FQgdNgvss9A&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=150

object PatternmatchDemo6 extends App {
  // example 1
  // return different value based on a 's value
  // val a = 7
  val a = 3
  val obj = if (a == 1) 1
  else if (a == 2) "2"
  else if (a == 3) BigInt(3)
  else if (a == 4) Map("aa" -> 1)
  else if (a == 5) Map(1 -> "aa")
  else if (a == 6) Array(1,2,3)
  else if (a == 7) Array("aa", 1)
  else if (a == 8) Array("dd")

  println("===============")

  // example 2
  // do OP same as ABOVE, but via pattern match
  val result = obj match {
    case a : Int => a
    /**
     *  1) case b: Map[String, Int] => "it's a String-Int map"
     *  2) for above, scala will pass obj to b. so b is just a normal var name (can be anything actually). developer can feel free to name it
     *  3) Map[String, Int] is a type.
     *  4) if pattern match OK, will run command after "=>" (e.g. "it's a String-Int map")
     */
    case b: Map[String, Int] => "it's a String-Int map"
    case c: Map[Int, String] => "it's a Int-String map"
    case d: Array[String] => "it's a string array"
    case e: Array[Int] => "it's an int array"
    case f: BigInt => Int.MaxValue
    case _ => "nothing"
  }

  println("obj = " + obj.toString)
  println("result = " + result)
}

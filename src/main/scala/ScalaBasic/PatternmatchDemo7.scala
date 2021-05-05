package ScalaBasic

object PatternmatchDemo7 extends App {
  val a = 2
  val obj = if (a == 1) 1
  else if (a == 2) "2"
  else if (a == 3) BigInt(3)
  else if (a == 4) Map("aa" -> 1)
  else if (a == 5) Map(1 -> "aa")
  else if (a == 6) Array(1,2,3)
  else if (a == 7) Array("aa", 1)
  else if (a == 8) Array("dd")

  println("===============")

  // do OP same as ABOVE, but via pattern match
  val result = obj match {
    // below only compare type, but DON'T CARE value
    case _:Int => println("int is matched !!")
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

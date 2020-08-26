package ScalaBasic

import scala.util.Try

object TryGetOrElse extends App {

    def CheckDataType(data: Seq[Any]): Any = {
        val (first, second, third) = 
        Try{ 
            (data(0), data(1), data(2)) match {
            case (_first: Int, _second: String, _third: Int) =>
               (_first.toString, _second.toString, _third.toString)
            }
         }.getOrElse(throw new Exception(s"input arg : $data not in the type: Int, String, Int"))
       }
    

    // run
    val seq1 = Seq(123, "this a string", 999)
    val r = CheckDataType(seq1)
    println(r)

}
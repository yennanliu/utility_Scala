package ScalaBasic

import scala.util.Try

object TryGetOrElse2 extends App {
    
   def CheckIfInt(data: Seq[Any]): Any = {
    val (result)  =
        Try {
            (data(0), data(1), data(2)) match {
            case (_first: Int, _second: Int, _third: Int) => 
                val _result = _first + _second + _third
                _result
            }
        }.getOrElse(throw new Exception(s"input arg : $data not in the type : Int, Int, Int"))
      (result)
   }

    // run
    val seq1 = Seq(123, 777, 999)
    val r = CheckIfInt(seq1)
    println(r)

}
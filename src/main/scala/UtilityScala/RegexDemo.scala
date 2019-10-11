import scala.util.matching.Regex

object RegexDemo {
   def main(args: Array[String]) {

 	  val pattern = new Regex("(S|s)cala")
      val str = "Scala is scalable and cool"

      println(">>>>  Regular expression output # 1 ")
      println((pattern findAllIn str).mkString(","))

      println(">>>>  Regular expression output # 2 ")
      println(pattern replaceFirstIn(str, "Java"))


	  val pattern2 = new Regex("abl[ae]\\d+")
      val str2 = "ablaw is able1 and cool"

      println(">>>>  Regular expression output # 3 ")
      println((pattern2 findAllIn str2).mkString(","))
   }
}
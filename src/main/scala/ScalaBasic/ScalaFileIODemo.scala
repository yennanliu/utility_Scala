package ScalaBasic

import scala.io.Source
import scala.io.Codec
import java.nio.charset.CodingErrorAction

object ScalaFileIODemo{

    def main(args: Array[String]){

        def loadUserIDNames(): Map[Int, String] = {

        // Handle character encoding issues
        implicit val codec = Codec("UTF-8")
        codec.onMalformedInput(CodingErrorAction.REPLACE)
        codec.onUnmappableCharacter(CodingErrorAction.REPLACE)

        // Create a Map save user_id, user_name 
        var userIDName:Map[Int, String] = Map()
        // Scala Load file
        val lines = Source.fromFile("data/fakefriends.csv").getLines()
        for (line <- lines) {

            var fields = line.split(",")
            var user_id = fields(0)
            var user_name = fields(1)
            userIDName += (fields(0).toInt -> fields(1))

            println("loaded data -> " + "user_id : " + user_id, "user_name : " + user_name )
                            }
        return userIDName
                                                }

        // load UserIDNameDict via the loadUserIDNames func as defined above
        val UserIDNameDict = loadUserIDNames()
        for (user <- UserIDNameDict){
            println(user)
        }

    }
}
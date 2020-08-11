package ScalaBasic

import scala.io.Source
import scala.io.Codec
import java.nio.charset.CodingErrorAction

object ScalaFileIODemo2{

    def main(args: Array[String]){

        val source = Source.fromFile("data/access_log_small.txt", "UTF-8")

        // use head check next string via buffered
        val iter = source.buffered

        // if the file is not too big, can make it as string
        val contents = source.mkString


        // test
        println("*** iter :")
        println(iter)

        println("*** contents :")
        println(contents)

        println("*** while go through the data :")
        while (iter.hasNext){
            if (iter.next() != null){
                println(iter)
                iter.next
                }
            else {
                println("end of buffered")
            }
        }
        source.close()

    }
}
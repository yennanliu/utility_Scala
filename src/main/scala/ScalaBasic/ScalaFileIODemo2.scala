package ScalaBasic

import scala.io.Source
import scala.io.Codec

import java.nio.charset.CodingErrorAction
import java.io.PrintWriter

object ScalaFileIODemo2{

    def main(args: Array[String]){

        // example1 : load from file
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

        // example2 : read from url / non file ...
        val source1 = Source.fromURL("https://www.scala-lang.org/", "UTF-8")

        val source2 = Source.fromString("this is msg via fromString")

        val source3 = Source.stdin

        // example3 : load from binary doc 

        // example4 : write into file
        val output = new PrintWriter("numbers.txt")
        for (i <- 1 to 100) output.println(i)
        output.close()

    }
}
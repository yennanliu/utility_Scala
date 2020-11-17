package WebAccessLog

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
import org.apache.spark.sql.functions._

object LoadWebAccessLog{

    def main(args : Array[String]){

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "LoadWebAccessLog")

        val lines = sc.textFile("data//access_log.txt")

        val header = lines.first()

        lines.take(10)

        val restLog = lines.map( x => x.split("\t")).map( x => x(0) )//.map(x => x.split(" ")).map( x => x(1))  //.map( x => x(2) )

        //https://courses.cs.washington.edu/courses/cse414/16sp/lectures/lec26-spark-small.pdf
        lines.filter( x => x.contains("GET")).take(10)


    }

}
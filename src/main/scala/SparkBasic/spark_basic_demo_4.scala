package SparkBasic

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.log4j._

object spark_basic_demo_4{

    def main(args: Array[String]){

        val sc = new SparkContext("local[*]", "spark_basic_demo_4")

        println("CALCULATE word count")

        val input = sc.textFile("data/book.txt")

        val words = input.flatMap( x => x.split(" "))

        val wordcounts = words.countByValue()
        // val wordcounts = words.map( x => (x,1)).reduceByKey( (x, y) => x+y)

        for (wordcount <- wordcounts){ println(wordcount) } 
        // wordcounts.foreach(println)


    }
}
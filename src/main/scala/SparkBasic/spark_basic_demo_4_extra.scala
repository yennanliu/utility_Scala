package SparkBasic

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.log4j._

object spark_basic_demo_4_extra{

    def main(args: Array[String]){

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "spark_basic_demo_4_extra")

        println("CALCULATE word count better")

        val input = sc.textFile("data/book.txt")

        val words = input.flatMap( x => x.split("\\W+"))

        val lowercaseWords = words.map( x => x.toLowerCase() )

        val wordcounts = lowercaseWords.countByValue()
        // val wordcounts = words.map( x => (x,1)).reduceByKey( (x, y) => x+y)

        for (wordcount <- wordcounts){ println(wordcount) } 
        // wordcounts.foreach(println)


    }
}
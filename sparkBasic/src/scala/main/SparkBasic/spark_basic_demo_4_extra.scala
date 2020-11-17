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

        //val wordcounts = lowercaseWords.countByValue()
        val wordcounts = words.map( x => (x,1)).reduceByKey( (x, y) => x+y)

        val wordcountSorted = wordcounts.map( x => (x._2, x._1)).sortByKey() // here we map wordcounts as (value, key), since we want to sort the result by value via the "sortByKey()" method

        //for (wordcount <- wordcounts){ println(wordcount) } 
        //for (wordcount <- wordcountsSorted.sorted()){ println(wordcount) }
        //wordcountSorted.collect().sorted.foreach(println)
        for (result <- wordcountSorted) {
              val count = result._1
              val word = result._2
              println(s"$word: $count")
        }


    }
}
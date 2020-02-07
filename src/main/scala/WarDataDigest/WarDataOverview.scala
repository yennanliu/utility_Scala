package WarDataDigest

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.sql.SparkSession
import org.apache.log4j._


object WarDataOverview{


    def main(args: Array[String]){

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "WarDataOverview")

        val spark = SparkSession.builder.appName("WarDataOverview").config("spark.master", "local").getOrCreate()
        
        import spark.implicits._

        val gameLogDF = spark.read.json("data/war_data_sample.json")

        gameLogDF.printSchema()

        gameLogDF.take(10)

        val gameLog = gameLogDF.rdd

        gameLog.take(10)

    }
    

}
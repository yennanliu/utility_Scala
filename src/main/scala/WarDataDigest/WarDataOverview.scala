package WarDataDigest

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._


object WarDataOverview{


    def main(args: Array[String]){

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "WarDataOverview")

        val gameLog = sc.textFile("data/data/war_data_sample.json")

        gameLog.take(10)

    }
    

}
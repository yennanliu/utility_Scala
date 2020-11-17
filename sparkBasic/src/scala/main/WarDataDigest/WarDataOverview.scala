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

        //val gameLogDF = spark.read.json("data/war_data_sample.json")
        val gameLogDF = spark.read.json("data/war_data.json")

        gameLogDF.printSchema()

        gameLogDF.take(10)

        // 1) FILTER user_server_region = US log 
        gameLogDF.filter(gameLogDF("user_server_region") === "US").show()

        gameLogDF.filter(gameLogDF("platform") === "IOS_TABLET").show()

        gameLogDF.filter($"outcome".isNull).show()

        // 2) GROUP BY user_server_region, platform
        gameLogDF.groupBy("user_server_region").count().show()

        gameLogDF.groupBy("event_name").count().select("event_name").show()

        gameLogDF.groupBy("user_server_region", "platform").count().show()

        val gameLogDF_US = gameLogDF.filter(gameLogDF("user_server_region") === "US")
        val gameLogDF_EU = gameLogDF.filter(gameLogDF("user_server_region") === "EU")

        gameLogDF_US.groupBy("platform", "user_type").count().show()
        gameLogDF_EU.groupBy("platform", "user_type").count().show()

        // 3) DF -> RDD 
        val gameLogrRDD = gameLogDF.rdd

        gameLogDF_EU.select("platform").rdd.take(10)

        // 4) for loop OP 
        val event_list =  gameLogDF.groupBy("event_name").count().select("event_name").rdd.map( x => x(0)).collect()
        
        for (event <- event_list){
            val data_count = gameLogDF.filter(gameLogDF("event_name") === event).count()
            println ("evant_name : " + event + ", count : " + data_count)
        }

    }
    

}
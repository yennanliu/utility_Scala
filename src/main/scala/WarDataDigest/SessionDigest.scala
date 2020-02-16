package WarDataDigest

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import org.apache.spark.sql.functions.col

object SessionDigest{

    def main(args: Array[String]){

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "SessionDigest")

        val spark = SparkSession.builder.appName("SessionDigest").config("spark.master", "local").getOrCreate()

        import spark.implicits._

        val gameLogDF = spark.read.json("data/war_data.json")

        gameLogDF.printSchema()

        gameLogDF.take(10)

        // filter out battle log 
        val sessionLogDF = gameLogDF.filter($"session_id".isNotNull)

        sessionLogDF.groupBy("user_is_spender").count().show()

        sessionLogDF.groupBy("user_id").count().orderBy(("count")).show()

        // calculate the average user session time interval
        sessionLogDF.createOrReplaceTempView("session")
        val session_interval = spark.sql("""
              WITH sub AS
              (SELECT user_id,
               event_timestamp,
               lag(event_timestamp) OVER (PARTITION BY user_id ORDER BY user_id, event_timestamp) AS event_timestamp_lag
               FROM session
               ORDER BY user_id, event_timestamp)
            SELECT * FROM sub """)

        val session_diff = session_interval.withColumn("time_diff_sec", abs(coalesce(unix_timestamp($"event_timestamp_lag")) - coalesce(unix_timestamp($"event_timestamp"), lit(0))))
        session_diff.show()


    }

}
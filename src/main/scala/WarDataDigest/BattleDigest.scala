package WarDataDigest

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import org.apache.spark.sql.functions.col

object BattleDigest{

    def main(args: Array[String]){

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "BattleDigest")

        val spark = SparkSession.builder.appName("BattleDigest").config("spark.master", "local").getOrCreate()

        import spark.implicits._

        val gameLogDF = spark.read.json("data/war_data.json")

        gameLogDF.printSchema()

        gameLogDF.take(10)

        // filter out battle log 
        val battleLogDF = gameLogDF.filter($"battle_id".isNotNull)

        battleLogDF.groupBy("outcome").count().orderBy(("count")).show()

        battleLogDF.groupBy("battle_id").count().orderBy(("count")).show()

        // get battle count 
        val battle_count = battleLogDF.groupBy("user_id").count().withColumnRenamed("count", "battle_count")

        // get ship_destroyed sum
        val battle_result = battleLogDF.groupBy("user_id").sum().withColumnRenamed("sum(ship_destroyed)","ship_destroyed_sum")

        // merge df
        val battle_joined_df = battle_count.join(battle_result, Seq("user_id"), "inner")

        // // filter out the session log 
        // val sessionLogDF = gameLogDF.filter($"session_id".isNotNull)
        // sessionLogDF.groupBy("session_id").count().orderBy(desc("count")).show()

    }


}
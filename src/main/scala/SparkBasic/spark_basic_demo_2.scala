package SparkBasic

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object spark_basic_demo_2{

    def main(args: Array[String]){

        val conf = new SparkConf().setAppName("spark_basic_demo_2").setMaster("local[*]")
        val sc = new SparkContext(conf)

        def parseLine(line : String) = {

            val fields = line.split(",")
            val age = fields(2).toInt
            val numFriends = fields(3).toInt
            (age, numFriends)

        }

        val lines = sc.textFile("data/fake_friend.csv")
        val rdd = lines.map(parseLine)
        val totalsByAge = rdd.mapValues( x => (x,1) ).reduceByKey( (x,y) => (x._1 + y._1, x._2 + y._2)). // (x,y) => (number of friends, number of count by age by friends)
        val averageByAge = totalsByAge.reduceByKey( x => x._1/x._2 )
        val result = averageByAge.collect()

        result.sorted.foreach(println)

    }
}
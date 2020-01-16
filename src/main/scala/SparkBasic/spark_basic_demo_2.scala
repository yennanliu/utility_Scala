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


    }
}
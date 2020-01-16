package SparkBasic

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object spark_basic_demo_2{

    def main(args: Array[String]){

        val conf = new SparkConf().setAppName("spark_basic_demo_2").setMaster("local[*]")
        val sc = new SparkContext(conf)

        println("CALCULATE AVG friends BY AGE")

        def parseLine(line : String) = {

            val fields = line.split(",")
            val age = fields(2).toInt
            val numFriends = fields(3).toInt
            (age, numFriends)

        }

        val lines = sc.textFile("data/fakefriends.csv")
        // lines --> Array(0,Will,33,385, 1,Jean-Luc,26,2, 2,Hugh,55,221...) --> (user_id, user_name, age, numFriends)
        
        val rdd = lines.map(parseLine)
        //  rdd --> Array((33,385), (26,2), (55,221), (40,465))  : (age, numFriends) 
        
        val totalsByAge = rdd.mapValues( x => (x,1) ).reduceByKey( (x,y) => (x._1 + y._1, x._2 + y._2))  // (x._1 + y._1, x._2 + y._2)  --> (number of friends, number of count by age by friends)
        // rdd.mapValues( x => (x,1) )  --> Array((33,(385,1)), (26,(2,1)), (55,(221,1))...))  : (age, (numFriends,1))
        // rdd.mapValues( x => (x,1) ).reduceByKey( (x,y) => (x._1 + y._1, x._2 + y._2))  -->  Array((33,(385,1)), (26,(2,1)), (55,(221,1)), (40,(465,1))...)))  : (age, ( sum of numFriends , count of this combination))

        val averageByAge = totalsByAge.mapValues(x => x._1 / x._2)
        // Array((34,245), (52,340), (56,306) .. )) :  (age, avg_friends_by_age)

        val result = averageByAge.collect()

        // print out the result for loop
        result.sorted.foreach(println)

    }
}
package SparkBasic

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object spark_basic_demo_2_extra{

    def main(args: Array[String]){

        val conf = new SparkConf().setAppName("spark_basic_demo_2_extra").setMaster("local[*]")
        val sc = new SparkContext(conf)

        println("CALCULATE AVG friends BY FIRST NAME")

        def parseLine(line : String) = {

            val fields = line.split(",")
            val firstname = fields(1)
            val numFriends = fields(3).toInt
            (firstname, numFriends)

        }

        val lines = sc.textFile("data/fakefriends.csv")
        // lines --> Array(0,Will,33,385, 1,Jean-Luc,26,2, 2,Hugh,55,221...) --> (user_id, user_name, age, numFriends)
        
        val rdd = lines.map(parseLine)
        //  rdd --> Array((Will,385), (Jean-Luc,2), (Hugh,221)..)) : (firstname, numFriends) 
        
        val totalsByAge = rdd.mapValues( x => (x,1) ).reduceByKey( (x,y) => (x._1 + y._1 , x._2 + y._2))  // (x._1 + y._1, x._2 + y._2)  --> (number of friends, number of count by age by friends)
        // rdd.mapValues( x => (x,1) )  --> Array((Will,(385,1)), (Jean-Luc,(2,1)), (Hugh,(221,1))...))  : (firstname, (numFriends,1))
        // rdd.mapValues( x => (x,1) ).reduceByKey( (x,y) => (x._1 + y._1, x._2 + y._2))  -->  Array((Nog,(5399,22)), (Miles,(1942,10)), (Geordi,(4728,20)),...))  : (firstname, ( sum of numFriends , count of this combination))

        val averageByAge = totalsByAge.mapValues(x => x._1 / x._2)
        //  Array((Nog,245), (Miles,194), (Geordi,236), (Will,279), ..)) :  (firstname, avg_friends_by_age)

        val result = averageByAge.collect()

        // print out the results 
        lines.take(10)
        rdd.take(10)
        totalsByAge.take(10)
        averageByAge.take(10)
        result.sorted.foreach(println)

    }
}
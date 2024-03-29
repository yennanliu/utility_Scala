package SparkBasic

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.log4j._

object TotalSpentByCustomer{

    def main(args: Array[String]){

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "TotalSpentByCustomer")

        println("CALCULATE total spent by customer")

        def parseLine( line : String) = {

            val fields = line.split(",")
            val customerId = fields(0).toInt
            val amount = fields(1).toFloat
            val price = fields(2).toFloat

            (customerId, amount, price)
        }

        val lines = sc.textFile("data/customer-orders.csv")

        val rdd = lines.map(parseLine)

        // customer Spend Amount (in count)
        val customerSpendAmount = rdd.map( x => (x._1, x._2)).reduceByKey( (x,y) => x + y )
        val result = customerSpendAmount.collect()
        result.sorted.foreach(println)

        val sortedcustomerSpendAmount = customerSpendAmount.map( x => (x._2, x._1)).sortByKey()
        sortedcustomerSpendAmount.foreach(println)

        // customer Spend Amount (in dollar)
        // val customerTotalSpendAmount = rdd.map( x => (x._1, (x._2, x._3))).reduceByKey( (x,y) => (x._1 + y._1, x._2 + y._2)) //.reduceByKey( (x,y) => y._1 + y._2)
        // customerTotalSpendAmount.take(10)

    }
}
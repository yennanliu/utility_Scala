package SparkBasic

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object spark_basic_demo_1{

    def main(args: Array[String]){

        val conf = new SparkConf().setAppName("spark_basic_demo_1").setMaster("local[*]")
        val sc = new SparkContext(conf)

        // 0) define a rdd 
        val rdd = sc.parallelize(List(1,2,3,4))

        // 1) collect the rdd 
        rdd.collect()

        // 2) map a lambda func to RDD 
        val squares = rdd.map( x => x * x)

        // 3) map a func to RDD
        def squareIt( x : Int): Int = { 
            return x * x}

        rdd.map(squareIt).collect()

        def StringIt( x : Int): String = {
            return x.toString() + " -- "
        }

        rdd.map(StringIt).collect()

        // 4) count by values 
        val r = rdd.countByValue()

        // 4) reduce as a action to the RDD
        //rdd.map(squareIt).map( x => (x,1)).reduceByKey {case (x, y) => x + y }

    }
}
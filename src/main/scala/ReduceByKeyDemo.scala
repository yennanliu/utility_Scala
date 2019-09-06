/* SimpleApp.scala */
import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object ReduceByKeyDemo {
  def main(args: Array[String]) {
    // init spark 
    val spark = SparkSession
      .builder
      .appName("Spark Examples")
      .config("spark.master", "local")
      .getOrCreate()

    //val sc = spark.sparkContext

    // load a txt file 
    val lines = spark.sparkContext.textFile("/Users/jerryliu/utility_Scala/README.md")
    val pairs = lines.map(s => (s, 1))
    val counts = pairs.reduceByKey((a, b) => a + b)
    println(">>>> OUTPUT ")
    pairs.collect()
    println(">>>> OUTPUT ")

    // create pair RDD 
    val x = spark.sparkContext.parallelize(
            Array(("a", 1), ("b", 1), ("a", 1),
                  ("a", 1), ("b", 1), ("b", 1),
                  ("b", 1), ("b", 1)), 3)

    println(">>>> OUTPUT ")
    x.collect()
    println(">>>> OUTPUT ")
    // x: org.apache.spark.rdd.RDD[(String, Int)] = 
    // ParallelCollectionRDD[1] at parallelize at <console>:21    
    // Applying reduceByKey operation on x
    val y = x.reduceByKey((accum, n) => (accum + n))
    // y: org.apache.spark.rdd.RDD[(String, Int)] = 
    //  ShuffledRDD[2] at reduceByKey at <console>:23
     
    println(">>>> OUTPUT ")
    y.collect()
    println(">>>> OUTPUT ")
    // res0: Array[(String, Int)] = Array((a,3), (b,5))
     
    // Another way of applying associative function
    val z = x.reduceByKey(_ + _)
    // y: org.apache.spark.rdd.RDD[(String, Int)] = 
    //  ShuffledRDD[3] at reduceByKey at <console>:23
   
    println(">>>> OUTPUT ")
    z.collect()
    println(">>>> OUTPUT ")
    // res1: Array[(String, Int)] = Array((a,3), (b,5))
     
    // Define associative function separately
    def sumFunc(accum:Int, n:Int) =  accum + n
     
    val u = x.reduceByKey(sumFunc)
    // y: org.apache.spark.rdd.RDD[(String, Int)] = 
    //  ShuffledRDD[4] at reduceByKey at <console>:25
    
    println(">>>> OUTPUT ")
    u.collect()
    println(">>>> OUTPUT ")
    // res2: Array[(String, Int)] = Array((a,3), (b,5))
    spark.stop()
  }
}
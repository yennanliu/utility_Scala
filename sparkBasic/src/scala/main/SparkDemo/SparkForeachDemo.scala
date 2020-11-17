package SparkDemo

// import required spark classes
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
 
// define main method (Spark entry point)
object SparkForeachDemo {
  def main(args: Array[String]) {
 
    // initialise spark context
    val conf = new SparkConf().setAppName("SparkForeachDemo")
                              .setMaster("spark://172.1.1.1:7077")
    val spark: SparkSession = SparkSession.builder.config(conf).config("spark.master", "local").getOrCreate()

    val sparkConf = new SparkConf().setMaster("local").setAppName("Example")
    
    val testData = Array(Array(1,2,3), Array(4,5,6,7,8))
    val testRDD = spark.sparkContext.parallelize(testData, 2)

    // Print the RDD of arrays.
    println(" >>>>>>>>>>>>>> OUTPUT")
    testRDD.collect().foreach(a => println(a.size))
    println(" >>>>>>>>>>>>>> OUTPUT")

    // Use map() to create an RDD with the array sizes.
    val countRDD = testRDD.map(a => a.size)

    // Print the elements of this new RDD.
    println(" >>>>>>>>>>>>>> OUTPUT")
    countRDD.collect().foreach(a => println(a))
    println(" >>>>>>>>>>>>>> OUTPUT")

    // Use filter() to create an RDD with just the longer arrays.
    val bigRDD = testRDD.filter(a => a.size > 3)

    // Print each remaining array.
    println(" >>>>>>>>>>>>>> OUTPUT")
    bigRDD.collect().foreach(a => {
        a.foreach(e => print(e + " "))
        println()
      })
    println(" >>>>>>>>>>>>>> OUTPUT")

    spark.stop()  
  }
}
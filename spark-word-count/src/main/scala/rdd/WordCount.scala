package rdd
import com.typesafe.config.ConfigFactory
import org.apache.spark.{SparkConf, SparkContext}
import scala.io.Source

/*
Simple word count example 
 */

object WordCount extends App{
  val config = ConfigFactory.load()
  // load file via scala relative path 
  // https://stackoverflow.com/questions/42484965/unable-to-access-file-in-relative-path-in-scala-for-test-resource
  val filePath = "main/resources/sample.txt"
  //val filePath = config.getString("file_path")
  val sparkMaster = config.getString("SPARK_MASTER")
  val sparkAppName = config.getString("SPARK_APPNAME")

  val conf = new SparkConf().setMaster(sparkMaster).setAppName(sparkAppName)
  val sc = new SparkContext(conf)
  sc.setLogLevel("ERROR")

  val lines = sc.textFile(filePath)
  val words = lines.flatMap(line => line.split(" "))
  val counts = words.map(word => (word, 1)).reduceByKey { case (x, y) => x + y }

  println("foreach over collect will output in same order of textfile")
  counts.collect().foreach(println)

  sc.stop()
}

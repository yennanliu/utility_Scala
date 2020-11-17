package SparkDemo

/* SimpleApp.scala */
import org.apache.spark.sql.SparkSession

object SimpleApp {
  def main(args: Array[String]) {
    val logFile = "README.md" // Should be some file on your system
    val spark = SparkSession.builder.appName("Simple Application").config("spark.master", "local").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(" >>>>>>>>>>>>>> OUTPUT")
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    println(" >>>>>>>>>>>>>> OUTPUT")
    spark.stop()
  }
}
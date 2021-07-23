package SparkDemo
// https://spark.apache.org/docs/latest/sql-data-sources-hive-tables.html

// import required spark classes
import org.apache.spark.SparkConf
import org.apache.spark.sql.{Row, SaveMode, SparkSession}
import org.apache.spark.sql.SaveMode
import java.io.File

// define main method (Spark entry point)
object Txt2SQL {
  def main(args: Array[String]) {

    val warehouseLocation = new File("spark-warehouse").getAbsolutePath

    //val conf = new SparkConf().setAppName("Speak_txt_2_sql")
                           
    val spark = SparkSession
              .builder()
              .appName("Spark Hive Example")
              .config("spark.sql.warehouse.dir", warehouseLocation)
              .enableHiveSupport()
              .getOrCreate()

    import spark.implicits._
    import spark.sql

    case class Record(key: Int, value: String)

    // do stuff
    println("************")
    println("************")

    println("RUN HIVE SQL!") 
    sql("CREATE TABLE IF NOT EXISTS src (key INT, value STRING) USING hive")
    sql("LOAD DATA LOCAL INPATH 'data/kv1.txt' INTO TABLE src")
    // Queries are expressed in HiveQL
    sql("SELECT * FROM src").show()
    sql("SELECT COUNT(*) FROM src").show()

    println("************")
    println("************")
    
    // terminate spark context
    spark.stop()
    
  }
}
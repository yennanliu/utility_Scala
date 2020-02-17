package BostonHouse

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.sql.{Dataset, SparkSession, Row}
import org.apache.spark.sql.types.{DoubleType, StringType, StructField, StructType}
import org.apache.log4j._
import org.apache.spark.sql.functions._

object HouseDataSQL{

    def main(args : Array[String]){

        case class Boston(CRIM:Float, ZN:Float, INDUS:Float, CHAS:Float, NOX:Float, RM:Float, AGE:Float, DIS:Float, RAD:Float, TAX:Float, PTRATIO:Float, B:Float, LSTAT:Float, price:Float)

        def mapper(line:String): Boston = {

            val fields = line.split(',')

            val boston:Boston = Boston(fields(0).toFloat, fields(1).toFloat, fields(2).toFloat, fields(3).toFloat, fields(4).toFloat, fields(5).toFloat, fields(6).toFloat, fields(7).toFloat, fields(8).toFloat, fields(9).toFloat, fields(10).toFloat, fields(11).toFloat, fields(12).toFloat, fields(13).toFloat)

            return boston
        }

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "HouseDataSQL")

        val spark = SparkSession
                    .builder
                    .appName("HouseDataSQL")
                    .master("local[*]")
                    .getOrCreate()

        val lines = spark.sparkContext.textFile("data/boston_V2.csv")

        val bostonRDD = lines.map(mapper)
        
        bostonRDD.take(10)

        import spark.implicits._

        // val bostonDF = bostonRDD.toDF

        // bostonDF.printSchema()

        // bostonDF.createOrReplaceTempView("boston")

        // val price = spark.sql("SELECT price FROM boston").collect()

        // price.foreach(println)

        // spark.stop()


    }

}
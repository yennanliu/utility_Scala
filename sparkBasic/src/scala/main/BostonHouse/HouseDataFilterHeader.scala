package BostonHouse

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
import org.apache.spark.sql.functions._

object HouseDataFilterHeader{

    def main(args : Array[String]){

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "HouseDataFilterHeader")

        def parseLineWithHeader(line : String) = {

            val fields = line.split(",")
            val tmp = fields(0)

            // if numeric row
            try { 

            val CRIM = fields(0).toFloat
            val ZN = fields(1).toFloat
            val INDUS = fields(2).toFloat
            val CHAS = fields(3).toFloat
            val NOX = fields(4).toFloat
            val RM = fields(5).toFloat
            val AGE = fields(6).toFloat
            val DIS = fields(7).toFloat
            val RAD = fields(8).toFloat
            val TAX = fields(9).toFloat
            val PTRATIO = fields(10).toFloat
            val B = fields(11).toFloat
            val LSTAT = fields(12).toFloat
            val price = fields(13).toFloat

            (CRIM,ZN,INDUS,CHAS,NOX,RM,AGE,DIS,RAD,TAX,PTRATIO,B,LSTAT,price)

             } 
             // if header row
             catch{
                case e:Exception=>
                (0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
            }
        }

        // another way to filter csv header : 
        // https://indatalabs.com/blog/convert-spark-rdd-to-dataframe-dataset
        
        val lines = sc.textFile("data/boston.csv")

        val header = lines.first()

        val bostonRDD = lines.map(parseLineWithHeader)

        bostonRDD.take(10)

    }
}
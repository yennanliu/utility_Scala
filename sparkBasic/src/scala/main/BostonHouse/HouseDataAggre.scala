package BostonHouse

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
import org.apache.spark.sql.functions._

object HouseDataAggre{

    def main(args : Array[String]){

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "HouseDataAggre")

        def parseLine(line : String) = {

            val fields = line.split(",")

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
            val price = fields(13)

            (CRIM,ZN,INDUS,CHAS,NOX,RM,AGE,DIS,RAD,TAX,PTRATIO,B,LSTAT,price)

        }

        def float2int(line : Float) =  {

            line.toInt
        }

        val lines = sc.textFile("data/boston_V2.csv")

        val header = lines.first()

        val bostonRDD = lines.map(parseLine)
        
        bostonRDD.take(10)

        // Method 1 :  Float -> Int via lambda function (.map( x => x.toInt ))
        val ageCount = bostonRDD.map( x => x._7 ).map( x => x.toInt ).map( x => (x, 1) ).reduceByKey( (x,y) => x + y )

        // Method 2 :  Float -> Int via UDF (float2int)
        //val ageCount = bostonRDD.map( x => x._7) .map( x => float2int(x) ).map( x => (x, 1) ).reduceByKey( (x,y) => x + y )

        ageCount.take(10)

        val ageCountSorted = ageCount.map( x => (x._2,  x._1 )).sortByKey()

        for ( result <- ageCountSorted ){
            val count = result._1
            val price = result._2

            println (s"price : $price | count : $count")
       
            }

    }

}
package SparkBasic

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import scala.math.min

object spark_basic_demo_3{

    def main(args: Array[String]){

        val conf = new SparkConf().setAppName("spark_basic_demo_3").setMaster("local[*]")
        val sc = new SparkContext(conf)

        println("CALCULATE MIN temo BY location")

        def parseLine(line : String) = {

            val fields = line.split(",")
            val stationID = fields(0)
            val entryType = fields(2)
            val temperature = fields(3).toFloat*0.1f*(9.0f / 5.0f) + 32.0f // Celsius -> Fahrenheit

            (stationID, entryType, temperature)

        }

        val lines = sc.textFile("data/1800.csv")
        
        val rdd = lines.map(parseLine)

        // filter the data
        val minTemps = rdd.filter( x => x._2 == "TMIN")

        // get the station temperature
        val stationTemps = minTemps.map( x => (x._1, x._3.toFloat))

        // Reduce by stationID retaining the minimum temperature found
        val minTempsByStation = stationTemps.reduceByKey( (x,y) => min(x,y))

        val results = minTempsByStation.collect()

        // print the result
        for (result <- results.sorted) {
           val station = result._1
           val temp = result._2
           val formattedTemp = f"$temp%.2f F"
           println(s"$station minimum temperature: $formattedTemp") 
        }

    }
}
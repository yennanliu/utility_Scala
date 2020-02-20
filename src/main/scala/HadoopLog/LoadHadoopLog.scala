package HadoopLog

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
import org.apache.spark.sql.functions._

object LoadHadoopLog{

    def main(args : Array[String]){

        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "LoadHadoopLog")

        val lines = sc.textFile("data/loghub/Hadoop/Hadoop_2k.log")

        val header = lines.first()
        
        lines.take(10)

    }

}
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

        // timestamp
        val timestamp = lines.map( x => x.split(",") ).map( x => x(0) )
        timestamp.take(10) 
        timestamp.map( x => (x,1) ).reduceByKey( (x, y) => x + y ).take(10)


        // log info
        val logInfo = lines.map( x => x.split(",") ).map( x => x(1) )
        logInfo.take(10) 
        logInfo.map( x => (x,1) ).reduceByKey( (x, y) => x + y ).take(10)

        // // log msg 
        // val logMsg = lines.map( x => x.split(",") ).map( x => x(1) ).map( x  => x.split(": ") ).map( x => x(1) )
        // logMsg.take(10)
        // logMsg.map( x => (x,1) ).reduceByKey( (x, y) => x + y ).take(10)

        // regular expression
        val logMsg = lines.map( x => x.split("\t") ).map( x => x(0)  ).map( x => x.split("\\A") ).map( x => x(0) ).map( x => x.split(",")).map( x => x(1) ) 
        logMsg.take(20) 
        logMsg.map( x => (x,1) ).reduceByKey( (x, y) => x + y ).take(10)



    }

}
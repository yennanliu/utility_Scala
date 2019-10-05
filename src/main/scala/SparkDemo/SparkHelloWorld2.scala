package yen.scalautility

import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkConf
 
object SparkHelloWorld2 {

  def sparkJob(){
    println("this is a monk spark job")
  }
  def main(args: Array[String]){
      if(args.length==0)
        sparkJob();
      else {
        args(0) match   {
        case "1" => sparkJob();
        }
      }
  }
}
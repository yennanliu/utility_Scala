package SparkBasic

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object MovieUserProfile{

    def main(args: Array[String]){

        val sc = new SparkContext("local[*]", "MovieUserProfile")

        val spark = SparkSession
                    .builder
                    .appName("MovieUserProfile")
                    .master("local[*]")
                    .getOrCreate()

        def parseLineUser(line : String) = {

            // explicitly make "|" as string, but not any speical expression. For split the data in the right manner
            val fields = line.split("\\|")

            val userID = fields(0)
            val userAge = fields(1)
            val userSex = fields(2)
            val userJob = fields(3)
            val userPostcode = fields(4)

            (userID,userAge, userSex, userJob, userPostcode)
        }

        val lines_user = sc.textFile("data/ml-100k/u.user")

        val lines_movie = sc.textFile("data/ml-100k/u.data")


        lines_user.take(10)

        lines_movie.take(10)

        val userRDD = lines_user.map(parseLineUser)

        userRDD.take(10)

    }
}
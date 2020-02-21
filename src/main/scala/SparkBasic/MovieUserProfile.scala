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

        case class User(userID:Int, userAge:Int, userSex:String, userJob:String, userPostcode:String)

        case class Movie(userID:Int, itemID:Int, rating:Int, timestamp:Int)

        def parseLineUser(line : String): User = {

            // explicitly make "|" as string, but not any speical expression. For split the data in the right manner
            val fields = line.split("\\|")

            val userID = fields(0).toInt
            val userAge = fields(1).toInt
            val userSex = fields(2)
            val userJob = fields(3)
            val userPostcode = fields(4)

            val user:User = User(userID, userAge, userSex, userJob, userPostcode)

            return user 
        }

        def parseLineMovie(line : String): Movie = {

            val fields = line.split("\t")

            val userID = fields(0).toInt
            val itemID = fields(1).toInt
            val rating = fields(2).toInt
            val timestamp = fields(3).toInt

            val movie:Movie = Movie(userID, itemID, rating, timestamp)

            return movie 
        }

        // u.user : user id | age | gender | occupation | zip code
        val lines_user = sc.textFile("data/ml-100k/u.user")

        // u.data : user id | item id | rating | timestamp 
        val lines_movie = sc.textFile("data/ml-100k/u.data")


        lines_user.take(10)

        lines_movie.take(10)

        val userRDD = lines_user.map(parseLineUser)

        userRDD.take(10)

        val movieRDD = lines_movie.map(parseLineMovie)

        movieRDD.take(10)

        import spark.implicits._

        // val userDS = userRDD.toDS

        // userDS.show()

        // val movieDS = movieRDD.toDS

        // movieDS.show()



    }
}
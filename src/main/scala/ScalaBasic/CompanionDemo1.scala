package ScalaBasic

// https://www.scala-exercises.org/std_lib/objects
// An object that has the same name as a class is called a companion object of the class, and it is often used to contain factory methods for the class that it complements:

object CompanionDemo1 extends App {

class Movie(val name: String, val year: Short)

object Movie {
  def academyAwardBestMoviesForYear(x: Short) = {
    //This is a match statement, more powerful than a Java switch statement!
    x match {
      case 1930 => Some(new Movie("All Quiet On the Western Front", 1930))
      case 1931 => Some(new Movie("Cimarron", 1931))
      case 1932 => Some(new Movie("Grand Hotel", 1932))
      case _ => None
    }
  }
}

// run
println(Movie.academyAwardBestMoviesForYear(1932))
println(Movie.academyAwardBestMoviesForYear(1932).get.name)

}
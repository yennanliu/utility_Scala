package SparkBasic

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

/** Find the superhero with the most co-appearances. */
object MostPopularSuperhero {
  
  // Function to extract the hero ID and number of connections from each line
  def countCoOccurences(line: String) = {
    var elements = line.split("\\s+") // split whatever space via regurlar expression ( "//s+" : matches one or many whitespaces)
    ( elements(0).toInt, elements.length - 1 )
  }
  
  // Function to extract hero ID -> hero name tuples (or None in case of failure)
  // Option : Scala syntax, can accept value or None return
  def parseNames(line: String) : Option[(Int, String)] = {
    var fields = line.split('\"')
    if (fields.length > 1) {
      return Some(fields(0).trim().toInt, fields(1))
    } else {
      return None // flatmap will just discard None results, and extract data from Some results.
    }
  }
 
  /** Our main function where the action happens */
  def main(args: Array[String]) {
   
    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
    
     // Create a SparkContext using every core of the local machine
    val sc = new SparkContext("local[*]", "MostPopularSuperhero")   
    
    // Build up a hero ID -> name RDD
    val names = sc.textFile("data/marvel-names.txt")
    val namesRdd = names.flatMap(parseNames)

    // Load up the superhero co-apperarance data
    val lines = sc.textFile("data/marvel-graph.txt")
    
    // Convert to (heroID, number of connections) RDD
    val pairings = lines.map(countCoOccurences)
    // or can via below 
    // val pairings = lines.map( x => x.split("\\s+")).map( x => (x(0), x.length - 1))
    
    // Combine entries that span more than one line
    val totalFriendsByCharacter = pairings.reduceByKey( (x,y) => x + y )
    
    // Flip it to # of connections, hero ID
    val flipped = totalFriendsByCharacter.map( x => (x._2, x._1) )
    
    /* TOP 1 */
    // Find the max # of connections
    val mostPopular = flipped.max()
    
    // Look up the name (lookup returns an array of results, so we need to access the first result with (0)).
    val mostPopularName = namesRdd.lookup(mostPopular._2)(0)
    
    // Print out our answer!
    println(s"$mostPopularName is the most popular superhero with ${mostPopular._1} co-appearances.") 
  

    /* TOP 10 */
    val to10Popular = totalFriendsByCharacter.map( x => (x._2, x._1) ).sortByKey(false).take(10)
    var i = 1
    for (hero <- to10Popular){
      val top10PopularName = namesRdd.lookup(hero._2)(0)
      println(s"$top10PopularName is the top ${i} popular superhero with ${hero._1} co-appearances.") 
      i += 1 
    }
    

 }
  
}

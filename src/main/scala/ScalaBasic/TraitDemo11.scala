package ScalaBasic

// https://www.youtube.com/watch?v=nWvx0t8C4gA&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=103

object TraitDemo11 extends App {
    // run
    val trait_11 = new loggedException{}
    trait_11.getMessage()
    trait_11.log()
}

/*
 * 1) in Scala, trait can extends from class (different with java)
 * 2) above makes sense, since trait can also be "abstract class" in scala -> abstract class extends from class -> makes sense
 */
trait loggedException extends Exception { // java.lang.Exception
  def log(): Unit = {
    println("loggedException 's log")
    println(getMessage())  // java.lang.Exception 's method
  }
}
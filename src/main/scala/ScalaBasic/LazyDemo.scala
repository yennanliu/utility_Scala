package ScalaBasic

object LazyDemo extends App {

    // When val is declared via Lazy, it won't be initialized till first called 
    lazy val words = scala.io.Source.fromFile("README.md").mkString

    // will not come up with error till it's called
    lazy val wordsNotExist = scala.io.Source.fromFile("xxx.md").mkString


    // get the values with declare it
    val wordsRegular = scala.io.Source.fromFile("README.md").mkString

    // get the value when calling everytime 
    def wordsDef = scala.io.Source.fromFile("README.md").mkString

    println(words)
    println(wordsRegular)
    println(wordsDef)

}
package ScalaBasic

// https://www.scala-exercises.org/std_lib/higher_order_functions
// Higher Order Functions: Higher Order Functions are functions that take functions as arguments and/or return functions.

object HigherOrderFuncDemo_5 extends App{

// Function taking another function as a parameter. Helps in composing functions.
// Hint: a map method applies the function to each element of a list.

def makeUpper(xs: List[String]) =
  xs map {
    _.toUpperCase
  }

def makeLower(xs: List[String]) =
  xs map {
    _.toLowerCase
  }

def makeWhatEverYouLike(xs: List[String], sideEffect: String => String) =
  xs map sideEffect


// run
println(makeUpper(List("abc", "xyz", "123")))
println(makeLower(List("abc", "xyz", "123")))
println(makeWhatEverYouLike(List("ABC", "XYZ", "123"), x => x.toLowerCase))

// run inline
val myName = (name: String) => s"My name is $name"
println(makeWhatEverYouLike(List("John", "Mark"), myName))


println(List("Scala", "Erlang", "Clojure") map (_.length))
}

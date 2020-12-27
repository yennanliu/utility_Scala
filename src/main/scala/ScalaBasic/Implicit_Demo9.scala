package ScalaBasic

// https://www.scala-exercises.org/std_lib/implicits

// Implicits can be used to declare a value to be provided as a default as long as an implicit value is set with in the scope. These are called Implicit Function Parameters:

object Implicit_Demo9 extends App{

    println("Implicit_Demo9 run ...")

    def howMuchCanIMake_?(hours: Int)(implicit dollarsPerHour: BigDecimal) =
        dollarsPerHour * hours

    implicit val hourlyRate = BigDecimal(34)

    // run
    // "dollarsPerHour" is not defined. However, there is a val called hourlyRate with same dtype as an implicit val
    // so Scala will use that in the howMuchCanIMake_? method and still perform the functionality 
    println(howMuchCanIMake_?(30))

}
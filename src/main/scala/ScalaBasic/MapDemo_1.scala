package ScalaBasic

// https://www.scala-exercises.org/std_lib/maps

object MapDemo_1 extends App{

    // Maps can be added to easily
    val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Michigan")
    val aNewMap = myMap + ("IL" -> "Illinois")
    println(aNewMap)

    // Maps insertion with duplicate key updates previous entry with subsequent value
    val myMap2 = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Meechigan")
    println(myMap2("MI")) //Meechiga

    // Map keys may be of mixed type
    val myMap3 = Map("Ann Arbor" -> "MI", 49931 -> "MI")
    myMap3("Ann Arbor")
    myMap3(49931)

    // If a nonexistent map key is requested using myMap(missingKey), a NoSuchElementException will be thrown. Default values may be provided using either getOrElse or withDefaultValue for the entire map
    val myMap4 = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    println(myMap.getOrElse("TX", "missing data"))

    val myMap5 = Map(
        "MI" -> "Michigan",
        "OH" -> "Ohio",
        "WI" -> "Wisconsin",
        "IA" -> "Iowa") withDefaultValue "missing data"
    println(myMap5("TX"))

    // Map elements can be removed easily
    val myMap6 = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    val aNewMap6 = myMap - "MI"
    println(myMap6.contains("MI"))
    println(aNewMap6.contains("MI"))

    // Map elements can be removed in multiple
    val myMap7 = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    val aNewMap7 = myMap -- List("MI", "OH")
    println(aNewMap7)

    // Map equivalency is independent of order
    val myMap8 = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    val myMap9 = Map("WI" -> "Wisconsin", "MI" -> "Michigan", "IA" -> "Iowa", "OH" -> "Ohio")
    println(myMap8.equals(myMap9))

}
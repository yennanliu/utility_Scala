package ScalaBasic

// https://www.tutorialspoint.com/scala/scala_options.htm

object SomeDemo extends App {

    // example 1 
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
  
    println("capitals.get( \"France\" ) : " +  capitals.get( "France" ))
    println("capitals.get( \"India\" ) : " +  capitals.get( "India" ))

    // example 2
    def show(x: Option[String]) = x match {
        case Some(s) => s
        case None => "??"
    }

    println("show(capitals.get( \"Japan\")) : " + show(capitals.get( "Japan")) )
    println("show(capitals.get( \"India\")) : " + show(capitals.get( "India")) )

    // example 1
    def name(o: Option[String]) = o match {
    case Some(r) => r
    case None    => "empty"
    }

    val rooms = Map(101 -> "Justin", 102 -> "caterpillar")
    println(name(rooms.get(101)))       // Justin
    println(name(rooms.get(102)))       // caterpillar
    println(name(rooms.get(103)))       // empty

    val list = List(Some("Justin"), None, Some("momor"))
    for(Some(result) <- list) {
        println(result)
    }

    // example 2
    def doSomeUpper(x: String) = {  // return type : Option[String]
    if(x == "some") Some(x.toUpperCase) else None
    }

    println(doSomeUpper("idontknow"))     // None
    println(doSomeUpper("some"))          // Some(SOME)

    // example 3 
    val mymap = Map("jim" -> 99, "ken" -> 101, "jay" -> 55)
    println(Some(mymap.get("jim")))    // Some(Some(55))
    println(Some(mymap.get("xxxx")))   // Some(None) 


}
package ScalaBasic

object ScalaHashMap{

    def main(args: Array[String]){
        // a simple static map 
        val scores = Map("alice" -> 10, "bob" -> 3, "cindy" -> 99)
        println(scores)
        println(scores("cindy"))

        // a simple dynamic map 
        val scores_dynamic = scala.collection.mutable.Map("alice" -> 10, "bob" -> 3, "cindy" -> 99)
        println(scores_dynamic) 

        // a simple null map
        val scores2 = new scala.collection.mutable.HashMap[String, Int]
        println(scores2)

        // check if key in HashMap
        val bobscore = if (scores.contains("bob")) scores("bob") else 0
        val jimscore = if (scores.contains("jim")) scores("jim") else 0
        println(bobscore)
        println(jimscore)
        // another way
        val bobscore_ = scores.getOrElse("bob", 0)
        println(bobscore_)

        // update HashMap's value 
        scores_dynamic("bob") = 100
        scores_dynamic("kelly") = 8
        println(scores_dynamic)

        // remove HashMap's value 
        scores_dynamic -= ("bob")

        // iterate over HashMap
        for ((k,v) <- scores)
            println(k,v)

        for (v <- scores.values)
            println(v)

        // inverse key, value
        val score_key_value_inverse = for((k,v) <- scores) yield (v,k)
        println(score_key_value_inverse)

        // sort HashMap
        val scores_sorted = scala.collection.immutable.SortedMap("alice" -> 10, "bob" -> 3, "cindy" -> 99)
        println(scores_sorted)

        // work with java 
        // dev 

        // zip op
        val symbols = Array("<", "-", ">")
        val counts = Array(2, 10, 99)
        val pairs = symbols.zip(counts)
        println(pairs)
        for ((s,n) <- pairs) println((s,n))

        // zip -> HashMap
        val pairs_map = pairs.toMap
        println(pairs_map)

    }
}
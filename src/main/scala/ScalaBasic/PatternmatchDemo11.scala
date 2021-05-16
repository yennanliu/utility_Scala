package ScalaBasic

// https://www.youtube.com/watch?v=N8FVcgp7VZI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=156

object PatternmatchDemo11 extends App {
    // example 1
    val map1 = Map("A" -> 1, "B" -> 2, "C" -> 0)

    for ( (k,v) <- map1 ) {
      println(k + "->" + v)
    }

    // only print if (k,v)'s  v = 0 (hardcode)
    for ( (k,0) <- map1 ) {
      println(k + "->" + 0)
    }

  // only print if (k,v)'s  v = 0 (with if logic)
    for ( (k,v) <- map1  if v == 0) {
      println(k + "->" + v)
    }
}

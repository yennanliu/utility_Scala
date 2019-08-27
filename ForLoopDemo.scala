object ForLoopDemo {
  def main(args: Array[String]) {

    println("Loop1");
    for (a <- 1 to 10) {
      println(a);
    }

    println("Loop2");
    for (a <- 1 until 10) {
      println(a);
    }

    println("Loop3");
    for (a <- 1 to 10 if a % 2 == 0) {
      println(a);
    }

    println("Collect loop data via yield and print it");
    var result = for (a <- 1 to 10) yield a
    for (i <- result) {
      println(i)
    }
    println("Loop over a list");
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9) // Creating a list
    for (i <- list) { // Iterating the list
      println(i)
    }

    println("Loop over a list via foreach");
    list.foreach {
      println // Print each element
    }
  }
}

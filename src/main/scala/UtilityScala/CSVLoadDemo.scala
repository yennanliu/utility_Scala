object CSVLoadDemo extends App {

    println("name, country, credit, date")
    val bufferedSource = io.Source.fromFile("data/log_demo.csv")

    for (line <- bufferedSource.getLines) {
        val cols = line.split(",").map(_.trim)
        // do whatever you want with the columns here
        println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
    }
    bufferedSource.close
}
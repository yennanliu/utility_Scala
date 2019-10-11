import scala.collection.mutable.ArrayBuffer

object CSVLoadDemo extends App {

    // >>>>>>>>>>>> METHOD 1 
    // println("name, country, credit, date")
    // val bufferedSource = io.Source.fromFile("data/log_demo.csv")

    // for (line <- bufferedSource.getLines) {
    //     val cols = line.split(",").map(_.trim)
    //     // do whatever you want with the columns here
    //     println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
    // }
    // bufferedSource.close


    // >>>>>>>>>>>> METHOD 2 
    // each row is an array of strings (the columns in the csv file)
    val rows = ArrayBuffer[Array[String]]()

    // (1) read the csv data
    using(io.Source.fromFile("data/log_demo.csv")) { source =>
        for (line <- source.getLines) {
            rows += line.split(",").map(_.trim)
        }
    }

    // (2) print the results
    for (row <- rows) {
        println(s"${row(0)}|${row(1)}|${row(2)}|${row(3)}")
    }

    def using[A <: { def close(): Unit }, B](resource: A)(f: A => B): B =
        try {
            f(resource)
        } finally {
            resource.close()
        }
}
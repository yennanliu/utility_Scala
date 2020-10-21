package ScalaBasic

// http://icejoywoo.github.io/2018/12/29/scala-implicit.html

import scala.language.implicitConversions
import java.time.LocalDate

class DateHelper(offset: Int) {
    def days(when: String): LocalDate = {
        val today = LocalDate.now
        when match {
            case "ago" => today.minusDays(offset)
            case "from_now" => today.plusDays(offset)
            case _ => today
        }
    }
}

object DateHelper {
    val ago = "ago"
    val from_now = "from_now"

    // define implicit function
    implicit def convertInt2DateHelper(offset: Int): DateHelper = new DateHelper(offset)
}

object ImplicitFunc extends App {
    // need to import implicit method before using 
    import DateHelper._

    println(s"today : ${LocalDate.now}")
    println(2 days ago)
    println(5 days from_now)
}
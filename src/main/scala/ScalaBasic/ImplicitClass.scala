package ScalaBasic

// http://icejoywoo.github.io/2018/12/29/scala-implicit.html

import java.time.LocalDate

object DateUtil {
    val ago = "ago"
    val from_now = "from_now"

    implicit class DateHelperImplicitClass(offset: Int) {
        def days(when: String): LocalDate = {
            val today = LocalDate.now
            when match {
                case "ago" => today.minusDays(offset)
                case "from_now" => today.plusDays(offset)
                case _ => today
            }
        }
    }
}

object ImplicitClass extends App {
    import DateUtil._

    println(s"today : ${LocalDate.now}")
    println(2 days ago)
    println(5 days from_now)
}
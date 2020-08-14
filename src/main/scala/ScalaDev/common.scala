package ScalaBasic

import org.joda.time.format.{DateTimeFormat, DateTimeFormatter, ISODateTimeFormat}
import org.joda.time.{DateTime, DateTimeZone, Hours, Years}
import org.slf4j.LoggerFactory

class common {
  val dateHourFormat = DateTimeFormat.forPattern("yyyy-MM")
  private val logger = LoggerFactory.getLogger(this.getClass.getName)

  case class YYYYMMDDHH(yyyy: String, mm: String, dd: String, hh: String)  {
    val yyyymmdd: Int = s"$yyyy$mm$dd".toInt
    yyyymmdd
  }

}

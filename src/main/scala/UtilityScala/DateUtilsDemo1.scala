package UtilityScala

import YenPackage.DateUtils

object DateUtilsDemo1 extends App {

  val time1 = "20210101"

  val time2 = "202101"

  val time3 = "2021010109"

  val time_taipei = DateUtils.dateFormatTaipei.parseDateTime(time1)

  val time_yyyymm = DateUtils.yyyyMMFormat.parseDateTime(time2)

  val time_yyyymmddhr = DateUtils.yyyyMMddHHFormat.parseDateTime(time3)

  println("time1 = " + time1)
  println("time_taipei = " + time_taipei)
  println("time_yyyymm = " + time_yyyymm)
  println("time_yyyymmddhr = " + time_yyyymmddhr)
}

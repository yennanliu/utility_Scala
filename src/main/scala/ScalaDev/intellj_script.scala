package ScalaDev

import java.io.{BufferedWriter, File, FileWriter}

import org.slf4j.LoggerFactory

import scala.io.Source
import scala.util.Try
import ScalaDev.YenLib
import ScalaDev.common

object intellj_script extends App{
  val Logger = LoggerFactory.getLogger(this.getClass)
  println("this is intllj script")
  for (i <- 1 to 20)
    println(i)

  println("run from YenLib")
  val yenlib = new YenLib
  yenlib.printsth()

  val y = yenlib.largerSmaller(16)
  println(y)

  println(yenlib.ShopUrl)

  private def fileToMap(filename: String): Map[Int, String] = {
    (for {
      line <- Source.fromFile(filename).getLines
      s = line.split("\t")
    } yield (s(0).toInt, s(1))).toMap[Int, String]
  }

  val filename = "/home/yennan.liu/yen_scala"

//  val z = fileToMap(filename)
//  println (z)

  Logger.info( "---- \n" + "this is runnign log \n" + "----")

  val com = new common
  val mytime = com.YYYYMMDDHH("2020", "11", "11", "11")
  println(mytime)

}

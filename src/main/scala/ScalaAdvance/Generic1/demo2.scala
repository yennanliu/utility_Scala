package ScalaAdvance.Generic1

// https://www.bilibili.com/video/BV12N411R726?p=272

import ScalaAdvance.Generic1.SeasonEnum

object demo2 {
  def main(args: Array[String]): Unit = {
    // run
    // TODO : fix below
    //val class01 = new EnglishClass[SeasonEnum, String, String](SeasonEnum.spring, "0001","intro")

    //val class02 = new EnglishClass[SeasonEnum, String, String](SeasonEnum.summer, "002","advanced")
  }
}

// val classSeason:A -> will make the input arg as READ ONLY arg
class EnglishClass[A,B,C](val classSeason:A, val className:B, val classType:C)

// season is an enumerate class
// https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/EnumerationDemo.scala
class SeasonEnum extends Enumeration {
  type seasonEnum = Value
  val spring, autumn, summer, winter = Value
}

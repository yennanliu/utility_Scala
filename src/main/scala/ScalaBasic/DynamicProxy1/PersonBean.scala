package ScalaBasic.DynamicProxy1

// https://www.bilibili.com/video/BV12N411R726?p=270&spm_id_from=pageDriver

// a scala trait, similar as interface in java
trait PersonBean {

  // getter, setter
  def getName():String

  def getGender():String

  def getInterests():String

  def getScore():Int

  def setName(name:String)

  def setGender(gender:String)

  def setInterests(interests:String)

  def setScore(score:Int)
}

package ScalaBasic.DynamicProxy1

// https://www.bilibili.com/video/BV12N411R726?p=270&spm_id_from=pageDriver

// the class is going to be used
class PersonBeanImplement extends PersonBean {

  // attr
  var name = ""
  var gender = ""
  var interests = ""
  var score:Int = _

  // method
  override def getName(): String = {
    name
  }

  override def getGender(): String = {
    gender
  }

  // can be used by ourselves, but CAN'T be used by OTHER users
  override def getInterests(): String = {
    interests
  }

  override def getScore(): Int = {
    score
  }

  override def setName(name: String): Unit = {
    this.name = name
  }

  override def setGender(gender: String): Unit = {
    this.gender = gender
  }

  override def setInterests(interests: String): Unit = {
    this.interests = interests
  }

  // can't be used by ourselves, but can be used by OTHER users
  override def setScore(score: Int): Unit = {
    this.score = score
  }
}

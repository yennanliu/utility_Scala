package ScalaBasic.DynamicProxy1

// https://www.bilibili.com/video/BV12N411R726?p=270&spm_id_from=pageDriver

import java.lang.reflect.Proxy

class MatchService {

  // create a  person
  val tom = getPersonInfo("tom", "male", "cook")

  // get our own proxy (represents the tom instance)
  val OwnerProxy = getOwnerProxy(tom)

  println("Name = " + OwnerProxy.getName()) // tom
  println("Interests = " + OwnerProxy.getInterests()) // cook

  println("Gender = " + OwnerProxy.getGender())

  OwnerProxy.setInterests("hiking")
  println("Interests = " + OwnerProxy.getInterests()) // hiking

  OwnerProxy.setScore(100)
  println("Score = " + OwnerProxy.getScore()) // still 0

  // method

  def getPersonInfo(name:String, gender:String, interests:String):PersonBean = {
    val person = new PersonBeanImplement()
    person.setName(name)
    person.setGender(gender)
    person.setInterests(interests)
    
    person
  }

  def getOwnerProxy(person: PersonBean):PersonBean = {
    Proxy.newProxyInstance(
      person.getClass().getClassLoader,
      person.getClass().getInterfaces(),
      new OwnerInvocationHandler(person)
    ).asInstanceOf[PersonBean]
  }
}

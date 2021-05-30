package ScalaBasic

// https://www.youtube.com/watch?v=smtulYDn7OU&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=172

object Curry_demo2 extends App {

  // Question : check if 2 string are equal (neglect uppercase, lowercase)

  val str1 = "hello"
  val str2 = "HELLo"

  // example 1 : regular method
  def checkEq1(s1: String)(s2: String): Boolean = {
    s1.toLowerCase == s2.toLowerCase
  }

  println(checkEq1(str1)(str2))

  println("==================")

  // example 2 : via curry
  /**
   *  Curry
   *  1) split operations from 1 method to 2 methods (or more)
   */
  def eq(s1: String, s2: String): Boolean = {
    s1.equals(s2)
  }

  // implicit class
  // can add new method (checkEq) to the class (String)
  // ref :  https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/Implicit_4.scala
  implicit class testEQ(s: String) {
    // curry
    def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
      // 1) s.toLowerCase, ss.toLowerCase -> make string to lower case
      // 2) compare if 2 string are equal  (via method f)
      // note : s is from implicit class (testEQ) ; while ss is from method (checkEq)
      f(s.toLowerCase, ss.toLowerCase)
    }
  }

  println(str1.checkEq(str2)(eq))
}

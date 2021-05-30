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

  // example 2 : via curry
  /**
   *  Curry
   *  1) split operations from 1 method to 2 methods (or more)
   *
   *
   */
  def eq(s1: String, s2: String): Boolean = {
    s1.equals(s2)
  }

  // implicit class
  // 1.
  implicit class testEQ(s: String) {
    def checkEq2(ss: String)(f: (String, String) => Boolean): Boolean = {
      f(s.toLowerCase, ss.toLowerCase)
    }
  }



}

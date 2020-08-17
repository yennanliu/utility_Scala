package yen.scalautility

import org.scalatest.funsuite.AnyFunSuite

class HelloTests extends AnyFunSuite {

  class Person{
    private var privateAge = 0
    def age = privateAge
    def age_= (newValue: Int): Unit = {
            privateAge = newValue
          }
  }

  test("the name is set correctly in constructor") {
    val p = new Person
    p.age = 100
    assert(p.age == 100)
  }

  test("a Person's name can be changed") {
    val p2 = new Person
    p2.age = 999
    assert(p2.age == 999)
  }
}
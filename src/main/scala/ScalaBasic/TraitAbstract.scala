// https://ithelp.ithome.com.tw/articles/10192038

package ScalaBasic

object TraitAbstract extends App {

    // PART 1 : Trait VS abstract
    // abstract can onlt be inherited once
    abstract class A 
    abstract class B
    class C extends A

    // trait can be inherited multiple times
    trait A_
    trait B_
    class C_ extends A_ with B_

    // PART 2 : Super 
    abstract class Counter {
         def count(num1: Int , num2: Int) : Unit
         }

    class MyCounter extends Counter {
           var sum = 0
           def count(num1: Int , num2: Int): Unit = sum = num1 + num2
           def getSum = sum
          }

    trait Counter1 extends MyCounter {
        abstract override def count(num1:Int , num2:Int) = {
          if(num1 < 0 || num2 < 0) {
            super.count(num1,num2)
          } else {
            sum = num1 + num2
          }
        }
      }

    trait Filter1 extends MyCounter {
        abstract override def count(num1:Int , num2:Int) = {
          if(num1 < 0 || num2 < 0) {
            super.count(num1,num2)
          } else {
            sum = num1 + num2 * 2
          }
        }
      }

    // example 1 : (new MyCounter with Counter1 with Filter1)
    val counter1 = (new MyCounter with Counter1 with Filter1)
    counter1.count(1,2)
    counter1.sum

    counter1.count(-2,5)
    counter1.sum


    // example 2 : (new MyCounter with Filter1 with Counter1)
    val counter2 = (new MyCounter with Filter1 with Counter1)
    counter2.count(1,2)
    counter2.sum

    counter2.count(-1,2)
    counter2.sum

}
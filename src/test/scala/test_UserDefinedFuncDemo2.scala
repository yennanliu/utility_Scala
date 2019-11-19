import collection.mutable.Stack
import org.scalatest._
import org.scalatest.FlatSpec
import org.scalatest.tagobjects.Slow

//UDF 
import mydevclass.my_help_func

class test_my_help_func extends FlatSpec {

    "A add func" should "add input values x and y " in {
    var x = 1 
    var y = 2 
    var result = my_help_func.my_sum_func(x, y)
    assert ( result === 3 )
    }

    "A product func" should "product input values x and y " in {
    var x = 1 
    var y = 2 
    var result = my_help_func.my_product_func(x, y)
    assert ( result === 2 )
    }

}


// class test_UserDefinedFuncDemo2 extends FlatSpec {

//   "A Stack" should "pop values in last-in-first-out order" in {
//     val stack = new Stack[Int]
//     stack.push(1)
//     stack.push(2)
//     assert(stack.pop() === 2)
//     assert(stack.pop() === 1)
//   }

//   it should "throw NoSuchElementException if an empty stack is popped" in {
//     val emptyStack = new Stack[String]
//     assertThrows[NoSuchElementException] {
//       emptyStack.pop()
//     }
//   }
// }


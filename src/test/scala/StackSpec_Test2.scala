import collection.mutable.Stack
import org.scalatest._
import org.scalatest.FlatSpec
import org.scalatest.tagobjects.Slow

// http://www.scalatest.org/user_guide/tagging_your_tests

object DbTest extends Tag("com.mycompany.tags.DbTest")

class StackSpec_Test2 extends FlatSpec {

  "A Stack" should "this is assert test" in {
    var x =  1
    var y =  1 
    assert (x === y)

  }

 it must "subtract correctly" taggedAs(Slow, DbTest) in {
    val diff = 4 - 1
    assert(diff === 3)
  }
}
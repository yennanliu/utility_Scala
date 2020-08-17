import collection.mutable.Stack
import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.tagobjects.Slow

//UDF 
import mydevclass.my_help_func

class test_my_help_func extends AnyFlatSpec {

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

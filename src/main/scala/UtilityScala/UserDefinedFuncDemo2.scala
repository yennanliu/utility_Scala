object UserDefinedFuncDemo2 {
  def main(args: Array[String]) {

  println("Below is output of udf :")

  // UDF 
  // def UDF_name (var1 : var1_type,  var2 : var2_type...)
  //   return_type = {return contents}

  def my_sum_func (num1 : Int, num2 : Int):
    Int = {return num1 + num2 }

  def my_product_func (num1 : Int, num2 : Int):
    Int = { return num1*num2}

  def my_print_func (num1 : Int, var1 : String):
    String = {return "outut : " + var1}

  def my_no_return_value() : 
    Unit = println("this is my_func4") // use "Unit" if no return 

  def my_sum_func_with_dynamic_input (nums : Int*):
    Int = nums.reduceLeft((sum,num) => sum + num)


  println("run the output....")

  my_sum_func(1, 99)
  my_product_func(2,99)
  my_print_func(1, "helloworld")
  my_no_return_value()
  my_sum_func_with_dynamic_input(3,8)
  my_sum_func_with_dynamic_input(3,8,7,9)
                                }
                            }

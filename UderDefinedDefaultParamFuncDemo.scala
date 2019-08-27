object UderDefinedDefaultParamFuncDemo {
  def main(args: Array[String]) {
    println("Below is output of udf :")
    var result1 = myfunc1()
    println(result1)
    println(func_parameter_default_value()) // func with default parameters
    println(func_parameter_default_value(99, 100)) // func witn input parameters
  }

  def myfunc1() = {
    var a = 10
    a
  }

  def func_parameter_default_value(a: Int = 0, b: Int = 0): Int = {
    a + b
  }
}

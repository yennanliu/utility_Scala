object UderDefinedFuncDemo {
  def main(args: Array[String]) {
    println("Below is output of udf :")
    var result1 = myfunc1()
    var result2 = myfunc2()
    println(result1)
    println(result2)
    add_func(10,20)
  }

  def myfunc1() = {
    var a = 10
    a 
  }
  
  def myfunc2() = {
    var b = 20
    b  
  }

  def add_func( x:Int, y:Int) = {

    var z=x+y 
    println(z)
  }
}
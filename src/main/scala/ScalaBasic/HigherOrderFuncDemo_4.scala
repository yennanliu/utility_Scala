package ScalaBasic

// https://www.scala-exercises.org/std_lib/higher_order_functions
// Higher Order Functions: Higher Order Functions are functions that take functions as arguments and/or return functions.

object HigherOrderFuncDemo_4 extends App{

// Higher Order Function returning another function
def addWithoutSyntaxSugar(x: Int): Function1[Int, Int] = {
  new Function1[Int, Int]() {
    def apply(y: Int): Int = x + y
  }
}

// run
println (addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, Int]])

println (addWithoutSyntaxSugar(2)(3))

def fiveAdder: Function1[Int, Int] = addWithoutSyntaxSugar(5)

println (fiveAdder(5))

}

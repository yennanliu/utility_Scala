package ScalaBasic

object scala_basic_demo_4{

    def main(args: Array[String]){

    // scala try - exception demo 
    def my_func() {
      val x = 123
      val y = 234
      try {
        x > y 
        println("x > y")
      } 
      catch{
        case e:Exception=>
      }
    }

    // scala try - exception demo with func has input 
    def my_func_2(x:Int, y:Int) {
      try {
        x > y 
      } 
      catch{
        case e:Exception=>
        println ("exception")
      }
    }

    my_func()
    my_func_2(10, 2)

    }
}
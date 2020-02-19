package ScalaBasic

object scala_basic_demo_4{

    def main(args: Array[String]){

    // scala try - exception demo 
    def my_func() {
      val x = 123
      val y = 234
      try {
        x > y 
      } 
      catch{
        case e:Exception=>
        println ("exception")
      }
    }

    my_func()

    }
}
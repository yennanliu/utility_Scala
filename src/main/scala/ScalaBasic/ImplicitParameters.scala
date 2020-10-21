package ScalaBasic

// http://icejoywoo.github.io/2018/12/29/scala-implicit.html

object ImplicitParameters {

    // define implicit value
    implicit val name: String = "default"  

    def log(msg: String)(implicit name: String): Unit = println(s"[$name] $msg")

    def process(): Unit = {
        // update implicit value
        implicit val name: String = "process"
        log("doing something")
    }

    def main(args: Array[String]): Unit = {
        // update implicit value
        implicit val name: String = "main"
        log("start")
        process()
        log("end")("custom name")
    }
}
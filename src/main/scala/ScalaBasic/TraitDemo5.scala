package ScalaBasic

// https://www.youtube.com/watch?v=qPLze6T1oLI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=97

object TraitDemo5 extends App {
  val console = new Console
  console.log("hiiii !! this is log !!!!")
}

trait Logger {
  def log(msg: String)
}

// scala trait can use ALL JAVA'S Interface (extends)
// Serializable is a scala trait, but is from java.io.Serializable (trait Serializable extends Any with java.io.Serializable)
class Console extends Logger with Cloneable with Serializable {
  override def log(msg: String): Unit = {
    println(msg)
  }
}
package ScalaBasic

// https://www.1ju.org/scala/scala-singleton-and-companion-object

/* Singleton object is via "object" keyword rather than
 *  use "class". other class may dont need to use the method under such Singleton object
 */
object SingletonDemo1 extends App {
  SingletonDemo1Object.hello()
}

object SingletonDemo1Object {
  def hello():Unit = {
    println("hellooooooooo")
  }
}

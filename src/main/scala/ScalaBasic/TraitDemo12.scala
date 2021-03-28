package ScalaBasic

// https://www.youtube.com/watch?v=QkgYcDxCAIQ&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=104

object TraitDemo12 extends App {
  // run
  val trait02 = new UnhappyException
  println(trait02.getMessage())

  println(trait02.getCause())
}

trait loggedException_2 extends Exception { // java.lang.Exception
  def log(): Unit = {
    println("loggedException 's log")
    println(getMessage())  // java.lang.Exception 's method
  }
}

// let's extend trait loggedException below
class UnhappyException extends loggedException_2 {
  // it's also the subclass of Exception
  // -> so we can overwrite Exception's method here
  override def getMessage(): String = {
    "UnhappyException 's error msg"
  }
}

// but, we can't do sth like below, since class z is NOT the "child" class of Exception
//class z(){
//}
//
//class UnhappyException2 extends z with loggedException_2 {
//  override def getMessage(): String = {
//    "UnhappyException 's error msg"
//  }
//}

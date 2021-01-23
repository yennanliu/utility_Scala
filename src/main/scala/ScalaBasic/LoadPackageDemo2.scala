package ScalaBasic

// https://www.youtube.com/watch?v=Ll015pvwLn8&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=67

class A01{
}

class Bat{
}

object LoadPackageDemo2 extends App{

  class A01{
  }

  class Bat{
  }

  //run 1
  val a01 = new ScalaBasic.A01
  val a01_ = new A01  // "child" object call use "parent" class directly, no need to import
  println("A01 = " + a01)
  println("A01 = " + a01_)

  // run 2
  val bat01 = new Bat
  println("Bat = " + bat01) // if there no "full path" import, scala will use the "nearest" class.
}

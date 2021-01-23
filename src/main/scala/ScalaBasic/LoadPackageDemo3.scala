package ScalaBasic

// https://www.youtube.com/watch?v=Ll015pvwLn8&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=67

class C01{
}

class Bear{
}

// scala can have "multiple" entry point
object run2 extends App{
  println("this is run2")

  // use the "child" class, ans rename as C01_
  import ScalaBasic.LoadPackageDemo3.{C01 => C01_}
  val c01 = new C01_
  println("calaBasic.LoadPackageDemo3.C01 = " + c01)

  val c01_ = new C01
  println("ScalaBasic.C01 = " + c01_)
}

object LoadPackageDemo3 extends App{

  println("this is LoadPackageDemo3")

  class C01{
  }

  class Bear{
  }
}

package ScalaBasic

// https://www.youtube.com/watch?v=Ll015pvwLn8&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=67


// In scala, package can have it "child" package and can keep looping it...
package scala1{
  class A{

  }
  package scala1_1{
    package scala1_2{
      class A{

      }
    }
  }
}

package scala2{
  package B{

  }
}

object LoadPackageDemo4 extends App{

  // run
  import ScalaBasic.scala1.scala1_1.scala1_2
  val a1 = new scala1_2.A
  println("A = " + a1)

}

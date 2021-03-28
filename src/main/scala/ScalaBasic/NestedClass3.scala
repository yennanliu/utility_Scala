package ScalaBasic

// https://www.youtube.com/watch?v=c8gQvoaLhHk&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=105

// Another style doing "Nest Class" in Scala

object NestedClass3 extends App {
  // run

  // 1) Outer class
  val outer1: ScalaOuterClass3 = new ScalaOuterClass3

  // 2) Inner class
  // inner1's class type is "outer1.ScalaInnerClass"
  /** Note : we need "new" here, when create inner class */
  val inner1 = new outer1.ScalaInnerClass3
  // can run the method info (visit attr in outerclass from innerclass)
  inner1.info()
}

class ScalaOuterClass3 { // outer class
  // *** make a new "Alias" update here
  myOut =>
  class ScalaInnerClass3 { // inner class
    def info(): Unit = {
      /*  Note :
       *   1) Another style doing "Nest Class" in Scala
       *   2) via "myOut" visit outerClass' attr
       */
      println("name = " + myOut.name
        + " age = " + myOut.age)

      println("name = " + ScalaOuterClass3.this.name
        + " age = " + ScalaOuterClass3.this.age)
    }
  }

  // *** put the attr outside
  var name: String = "bob"
  private var age: Double = 1.2
}
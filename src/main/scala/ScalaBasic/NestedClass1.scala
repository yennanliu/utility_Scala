package ScalaBasic

// https://www.youtube.com/watch?v=c8gQvoaLhHk&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=105

object NestedClass1 extends App {
  // run

  // 1) Outer class
  val outer1: ScalaOuterClass = new ScalaOuterClass
  val outer2: ScalaOuterClass = new ScalaOuterClass

  println("outer1 = " + outer1 + " outer2 = " + outer2)

  // 2) Inner class
  // inner1's class type is "outer1.ScalaInnerClass"
  /** Note : we need "new" here, when create inner class */
  val inner1 = new outer1.ScalaInnerClass
  val inner2 = new outer1.ScalaInnerClass

  println("inner1 = " + inner1 + " inner2 = " + inner2)

  // 3) "static inner class" object
  val staticInner = new ScalaOuterClass.ScalaStaticInnerClass
  println(staticInner)
}

/** companion */
class ScalaOuterClass{ // companion class (outer class)
  class ScalaInnerClass{  // inner class
  }
}

object ScalaOuterClass{ // companion object
  /*
   *  Note : if put class inside "companion object"
   *   -> such class is automatically recognized as "static class"
   */
  class ScalaStaticInnerClass{ // static inner class
  }
}
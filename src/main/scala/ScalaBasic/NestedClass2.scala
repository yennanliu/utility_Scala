package ScalaBasic

// https://www.youtube.com/watch?v=c8gQvoaLhHk&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=105

object NestedClass2 extends App {
  // run

  // 1) Outer class
  val outer1: ScalaOuterClass2 = new ScalaOuterClass2

  // 2) Inner class
  // inner1's class type is "outer1.ScalaInnerClass"
  /** Note : we need "new" here, when create inner class */
  val inner1 = new outer1.ScalaInnerClass2
  // can run the method info (visit attr in outerclass from innerclass)
  inner1.info()
}

class ScalaOuterClass2 { // outer class
  var name: String = "bob"
  private var age: Double = 1.2

  class ScalaInnerClass2 { // inner class
    def info(): Unit = {
      /*  Note :
       *    1) call attr in outer class :  outerClass.this.attr
       *    2) outerClass.this can be referred as "instance" of outerClass
       *    3) then we gat the attr via above instance (outerClass.this)
       */
      println("name = " + ScalaOuterClass2.this.name
        + " age = " + ScalaOuterClass2.this.age)
    }
  }
}
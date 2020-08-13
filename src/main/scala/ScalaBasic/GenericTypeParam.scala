package ScalaBasic

// https://docs.scala-lang.org/tour/generic-classes.html
// https://stackoverflow.com/questions/36977738/what-does-the-syntax-functiont-means-in-scala

object GenericTypeParam extends App {

    // example 1
    // A as type parameter identifier
    class Stack[A] {
      private var elements: List[A] = Nil
      def push(x: A) { elements = x :: elements }
      def peek: A = elements.head
      def pop(): A = {
        val currentTop = peek
        elements = elements.tail
        currentTop
      }
    }

    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    println(stack.pop)  // prints 2
    println(stack.pop)  // prints 1

    val stack2 = new Stack[String]
    stack2.push("a")
    stack2.push("b")
    println(stack2.pop)  // prints "b"
    println(stack2.pop)  // prints "a"

    
}
package ScalaBasic

// https://docs.scala-lang.org/tour/generic-classes.html
// https://stackoverflow.com/questions/36977738/what-does-the-syntax-functiont-means-in-scala
// https://www.geeksforgeeks.org/generic-classes-in-scala/#:~:text=In%20Scala%2C%20forming%20a%20Generic,be%20Generic%20Classes%20in%20Scala.

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


    // example 2
    // T as type parameter identifier
    class ProcessWord[T] {
        def print(x : T) = {
            println("***" +  x.toString() + "***")
        }
    }

    val processw = new ProcessWord[Int]
    println(processw.print(123))

    val processw2 = new ProcessWord[String]
    println(processw2.print("abc"))

    // example 3 
    abstract class Divide[z]{
        def divide(u: z, v: z): z
    }

    class intDivide extends Divide[Int]{
        def divide(u: Int, v: Int):  Int = u / v
    }

    class doubleDivide extends Divide[Double]{
        def divide(u: Double, v: Double):  Double = u / v
    }

    val q = new intDivide().divide(25, 5) 
    val r = new doubleDivide().divide(21.0, 5.0) 

    // Displays output  
    println(q) 
    println(r) 
}
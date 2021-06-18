package ScalaBasic

// https://docs.scala-lang.org/tour/generic-classes.html
// https://docs.scala-lang.org/zh-cn/tour/generic-classes.html
object GeneralClass1 extends App {

    /**
     *  General Class
     *
     *  1) Generic classes take a type as a parameter within square brackets []
     *  2) A General Class class myClass[A] ...
     *     -> can only accept parameter as type A (or A's subclass)
     */

    // demo 1
    class Stack[A] {
      private var elements: List[A] = Nil
      def push(x: A): Unit =
        elements = x :: elements
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

    println("==============")

    val stack2 = new Stack[String]
    stack2.push("a")
    stack2.push("b")
    println(stack2.pop)  // prints "a"
    println(stack2.pop)  // prints "b"

    println("==============")

    // demo 2
    class myClass1[A]{
      val a = 123
      def hello(): Unit = {
        println("helloooo")
      }

      def myPrint(x:A): Unit = {
        println(s"myPrint : $x")
      }
    }

    val c1 = new myClass1[String]
    println("c1 = " + c1)
    c1.myPrint("hahahaha")
    //c1.myPrint(123) // this one not works, since we define A as String type when instantiate it

    val c2 = new myClass1[Int]
    println("c2 = " + c2)
    c2.myPrint(999)

    println("==============")

    // demo 3
    // general class can work on "A"'s subclass
    class Fruit
    class Apple extends Fruit
    class Banana extends Fruit

    val stack3 = new Stack[Fruit]
    val apple = new Apple
    val banana = new Banana

    stack3.push(apple)
    stack3.push(banana)

    println(stack3.pop)
    println(stack3.pop)
}

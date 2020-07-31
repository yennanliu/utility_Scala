// https://www.geeksforgeeks.org/scala-final/

package ScalaBasic

object OverrideDemo extends App {

    /*
     *  Override  
     */

    // example 1
    class Person(val name: String){
        override def toString = getClass.getName + "[name=" + name + "]"
    }
     
    class SecretAgent(codeanme: String) extends Person(codeanme){
        override val name = "secret"
        override val toString = "secret"
    }

    val tom = new Person("tom")
    println(tom.toString)

    val secretUser = new SecretAgent("tom")
    println(secretUser.name)
    println(secretUser.toString)

    // example 2
    abstract class Person2(){
        def id: Int
    }
     
    class Student(override val id: Int) extends Person2 {
        println ("this is Student class")
        println ("id = " + id)

    }

    val jim = new Student(1234)
    println(jim.id)


    // example 3
    class User(){
        //override def toString = getClass.getName + "[name=" + name + "[id=" + id + "]"
        // def printName = println(name)
        // def printId = println(id)
        def msg() = println("this is user")
    }

    class VipUser extends User{
         // def printName2() = println(name)
         // def printId2() = println("secret")
         override def msg() = println("this is VipUser")
    }
    
    /*
     *  Final
     */

    // example 1
    final class Car(val name: String){
    println("this is final class, so can't be overridden")

    }

    // can't override class Car
    // class Mycar(val codeanme: String) extends Car(codeanme){
    //     println(codeanme)
    // }

    // example 2 : final variable 
    // Scala program of using final variable 
    class Shapes 
    { 
        // define final variable 
        final val area:Int = 60
    } 
    // class Rectangle extends Shapes 
    // { 
    //     override val area:Int = 100
    //     def display() 
    //     { 
    //         println(area) 
    //     } 
    // } 

    // Creating object 
    // object GFG 
    // { 
    //     // Main method 
    //     def run(): Unit =
    //     { 
    //         var b = new Rectangle() 
    //         b.display() 
    //     } 
    // } 

    // example 3 : final class
    // Scala program of using final class 
    final class Shapes2
    { 
        // Final variables and functions 
        val height:Int = 0
        val width :Int =0
        final def CalArea() 
        { 
        } 
    } 
    // class Rectangle2 extends Shapes2 
    // { 
    //     // Cannot inherit Shapes class 
    //     override def CalArea() 
    //     { 
    //         val area:Int = height * width 
    //         println(area) 
    //     } 
    // } 

    // // Creating Object 
    // object GFG2 
    // { 
    //     // Main method 
    //     def run() 
    //     { 
    //         var b = new Rectangle() 
    //         b.CalArea() 
            
    //     } 
    // } 
     
}
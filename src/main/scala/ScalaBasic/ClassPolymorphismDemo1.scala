package ScalaBasic

/* In Scala, it's needed to declare type explicitly if want use a class
 * inherit from its parent class -> so can use both "parent" and "children" class methods
 */

// https://www.youtube.com/watch?v=pksGWwI0m-c&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=56

object ClassPolymorphismDemo1 extends App{

    // run
    val e1:Employee = new Employee  // or val e1 = new Employee
    println("e1 = " + e1)
    println(e1.id)
    println(e1.name)
    println(e1.sales)

    val e2:A = new Employee
    println("e2 = " + e2)

    class A {
    }

    class Employee extends A{
      var id: Int = 10
      var name: String = "jack"
      var sales: Double = 1000.0

      override def toString: String = {
        "id = " + id + " name = "  + name + " sales = " + sales
      }
    }

}

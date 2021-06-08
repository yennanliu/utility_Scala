package ScalaBasic.ClassDemo2

class Child extends Person {
  // attr
  override var age: Int = 0
  override var name: String = ""

  // constructor
  def this(name: String, age: Int) = {
    this
    this.name = name
    this.age = age
  }

  // method
  override def breath(): Unit = {
    println("Child breath")
  }

  override def walk(): Unit = {
    println("Child walk")
  }

  override def eat(): Unit = {
    println("Child eat")
  }

}

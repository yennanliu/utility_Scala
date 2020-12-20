package ScalaBasic

// https://blog.csdn.net/weixin_34358365/article/details/90627000
// Companion class and its class can visit the private object each other

object ApplyMethodDemo2 extends App{

  println("*** ApplyMethodDemo2 run ...")

  // Companion object can use its own private value
  val p = new Person
  println(p.age)
  p.age = 10

  println(Person.double(p))
  println(p.printObj)
}

class Person{
  private var _age = 2
  //def age_(num : Int) = this._age = num
  def age_=(num: Int) = this._age = num
  def age = _age
  def printObj: Unit = {
    print(s"People can see ${Person.obj}")
  }
}

object Person{
  // access the private class field "age"
  def double(p: Person) = p._age * 2

  private val obj = "Object Persion's Object"
}

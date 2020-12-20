package ScalaBasic

object ApplyMethodDemo3 extends App{

  val u_1 = new User(100, "jack", 100)
  println(u_1)
  println(u_1.id)
  println(u_1.name)
  println(u_1.initialCredit)
  println(u_1.printObj)

  val u_2 = new User(999, "Amy", 30)
  println(u_2)
  println(u_2.id)
  println(u_2.name)
  println(u_2.initialCredit)
  println(u_2.printObj)
}

class User(val id: Int, val name : String, val initialCredit : Double){

  private var credit = initialCredit

  def printObj: Unit = {
    print(s"People can see ${User.obj}")
  }
}

object User{
  def printName(u: User){ println(u.name) }
  def doubleCredit(u: User): Double = { u.credit * 2 }

  private val obj = "Object User's Object"
}
package ScalaBasic

object ApplyMethodDemo3 extends App{

  val u_1 = new User(100, "jack", 100)
  println(u_1)
  println(u_1.id)
  println(u_1.name)
  println(u_1.initialCredit)
  println(u_1.printObj)

  println(User.doubleCredit(u_1))
  println(User.checkCreditGroup(u_1))

  val u_2 = new User(999, "Amy", 30)
  println(u_2)
  println(u_2.id)
  println(u_2.name)
  println(u_2.initialCredit)
  println(u_2.printObj)

  println(User.doubleCredit(u_2))
  println(User.checkCreditGroup(u_2))
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

  def checkCreditGroup(u: User): String = u.credit match {
    case _ if (u.credit <= 50 ) => "group 1"
    case _ if (u.credit > 50 && u.credit <= 100 ) => "group 2"
    case _ => "group 3"
  }

  private val obj = "Object User's Object"
}
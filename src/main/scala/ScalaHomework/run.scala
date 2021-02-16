package ScalaHomework

object run extends App {
  // test run Employee
  val e_1 = new RegularEmployee
  //e_1.name = "tim"
  println(e_1.name)
  println(e_1.salary)
  e_1.getAnnual(e_1.salary)
  e_1.work(e_1.name)

  println("-----------------------")

  // test run manager
  val m_1 = new Manager
  println(m_1.name)
  println(m_1.salary)
  m_1.getAnnual(m_1.salary)
  m_1.managing()
  m_1.bonus()

  println("-----------------------")

  promptEmployeeOrManager(e_1)
  promptEmployeeOrManager(m_1)

  def promptEmployeeOrManager(role:Employee): Unit = {
    // https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/TypeConvert2.scala
    if (role.isInstanceOf[RegularEmployee] ){
      println("RegularEmployee")
      role.asInstanceOf[RegularEmployee].getAnnual(role.salary)
    } else {
      println("Manager")
      role.asInstanceOf[Manager].managing()
    }
  }
}

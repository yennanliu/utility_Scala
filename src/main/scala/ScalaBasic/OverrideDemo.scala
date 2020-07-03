package ScalaBasic

object OverrideDemo extends App {

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

}
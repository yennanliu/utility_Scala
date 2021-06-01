package ScalaBasic

// https://www.bilibili.com/video/BV12N411R726?p=243&spm_id_from=pageDriver

object ClassDemo1 extends App {
  // run
  val m = new myClassX("abc", "def")

  println(m.value1)

  println(m.value2)

  m.hello()

  m.sayHi()

  m.myPrint()

  m.myMethod()
}

class myClassX(x:String, y: String) extends baseClass {

  override val value1: String = this.x

  override val value2: String = this.y

  override def hello(): Unit = println("myClass hello !!")

  override def sayHi(): Unit = println("myClass sayHi !!")

  override def myPrint(): Unit = {
    for (i <- 1 to 5){
      println(i)
    }
  }

  def myMethod(): Unit ={
    println(s"this is myMethod... x = $x  | y = $y")
  }
}


abstract class baseClass{

  val value1:String

  val value2:String

  def hello(): Unit

  def sayHi(): Unit

  def myPrint(): Unit
}
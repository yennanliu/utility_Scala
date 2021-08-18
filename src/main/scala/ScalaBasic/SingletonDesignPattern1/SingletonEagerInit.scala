package ScalaBasic.SingletonDesignPattern1

// https://www.bilibili.com/video/BV12N411R726?p=257

object SingletonEagerInit extends App {

  // run (eager initialization)
  val instance1_ = Singleton2.getInstance()
  val instance2_ = Singleton2.getInstance()

  if (instance1_ == instance2_){
    println("same !")  // instance1 and instance2 are the same -> singleton
  }
}

// make Singleton constructor as private
class Singleton2 private() {}

// 餓漢式 (Eager initialization)
/**
 *  under the hood :
 *
 *  public Singleton2 getInstance() {
 *    return s();
 *  }
 */
object Singleton2 {  // Singleton2$ under the hood

  private val s:Singleton2 = new Singleton2

  def getInstance() ={
    s
  }
}
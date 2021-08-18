package ScalaBasic.SingletonDesignPattern1

// https://www.bilibili.com/video/BV12N411R726?p=257

object TestSingleton extends App {

  // run (lazy initialization)
  val instance1 = Singleton.getInstance()
  val instance2 = Singleton.getInstance()

  if (instance1 == instance2){
    println("same !")  // instance1 and instance2 are the same -> singleton
  }
}

  // make Singleton constructor as private
  class Singleton private() {}

  // 懶漢式 (lazy initialization)
  /**
   *  under the hood :
   *
   *  public Singleton getInstance(){
   *  if (s() == null) {
   *      s_$eq(new Singleton());
   *  }
   *  return s();
   *  }
   */
  object Singleton {  // Singleton$ under the hood

    private var s:Singleton = null

    def getInstance() ={
      if (s == null){
        s = new Singleton
      }
      s
    }
  }

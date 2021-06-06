package ScalaBasic.controlAbstract1

// https://www.youtube.com/watch?v=wxF1PWk7U4E&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=173

object demo1 extends App {

  // V1 : run
  myRunInThread {
    () => println("start working ... will take 5 sec ...")
      Thread.sleep(5000)
      println("completed !")
  }

  /**
   *  1) myRunInThread method get a "method" input ( () => unit )
   *  2) "method" input
   *      -> no input
   *      -> no output
   */
  def myRunInThread(f1: () => Unit) = {
    new Thread {
      override def run(): Unit = {
        // call f1
        f1()
      }
    }.start()
  }

  println("======================")

  // V2 : run
  myRunInThread2 {
      println("start working ... will take 5 sec ...")
      Thread.sleep(5000)
      println("completed !")
  }

  // V2 : simplicity it
  def myRunInThread2(f1: => Unit): Unit = {
    new Thread{
      override  def run(): Unit = {
        f1
      }
    }.start()
  }

}

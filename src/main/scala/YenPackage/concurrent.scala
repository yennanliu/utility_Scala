package YenPackage

import java.util.concurrent.Executors
import scala.concurrent.{ Await, ExecutionContext, Future }

class concurrent {

  // attr
  var threadCount:Int = 0

  // constructor
  def this(threadCount:Int){
    this
    this.threadCount = threadCount
  }

  // method
  def makeRunContext(threadCount: Int = 3): ExecutionContext = {

    println(s"threadCount = $threadCount")
    val threadPool = Executors.newFixedThreadPool(threadCount)
    println(this.getClass.getName)

    val exe = new ExecutionContext {

      override def execute(runnable: Runnable) = {
        threadPool.submit(runnable)
      }

      override def reportFailure(t: Throwable): Unit = {
        "failure when get concurrent context : " + println(t.printStackTrace())
      }
      sys.addShutdownHook{
        threadPool.shutdown()
      }
    }
    exe
  }
}

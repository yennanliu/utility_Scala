package ScalaAdvance

// https://www.youtube.com/watch?v=e7ngFSBr89M&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=142

object parallel_Demo_1 extends App {

  /** 1) run in sequence */
  //(1 to 5).foreach(x => println(x))
  (1 to 5).foreach(println(_))

  println("=================")

  /** 2) run in parallel */
  (1 to 5).par.foreach(println(_))

  println("=================")

  /** 3) check thread in parallel mood */
  val r1 = (0 to 100).map{case _ => Thread.currentThread().getName}.distinct  //distinct will remove duplicated elements
  val r2 = (0 to 100).par.map{case _ => Thread.currentThread().getName}.distinct

  println(r1)
  println(r2)
}

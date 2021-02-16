package ScalaBasic

// https://www.youtube.com/watch?v=Yt3WXQ8UAX4&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=83

object OverrideDemo4 extends App {

  // run
  val b = new BBBB
  println(b.sal) // 777
}

class AAAA {
  val age: Int = 10

  def sal(): Int={
    10
  }
}

class BBBB extends AAAA {
  override val age: Int = 20

  // val can override method (def) that without param
  //override def sal(): Int = 777
  override val sal: Int = 777
}

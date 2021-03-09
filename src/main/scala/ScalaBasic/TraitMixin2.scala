package ScalaBasic

// https://www.youtube.com/watch?v=UL0kERWHLt0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=98

object TraitMixin2 extends App {

  // TraitMixin mechanism is similar as below code
  // => via the Anonymous sub class
  val h = new H(){
    def sayOK(): Unit = {
      println("new added method !")
    }
  }
  h.sayOK()
}

object TTT {
  def sayOK(): Unit = {
    println("TTT sayOK !!!")
  }
}

class H {

}
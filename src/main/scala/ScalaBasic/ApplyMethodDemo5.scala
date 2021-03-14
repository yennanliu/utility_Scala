package ScalaBasic

// https://www.youtube.com/watch?v=rbOubS9kKH0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=99

object ApplyMethodDemo5 extends App {
  // run
  val p1 = Person_6("kyo")
  println(p1.name)

}


// companion object & class with apply method
class Person_6(pName: String){
  val name = pName
}

object Person_6{
  def apply(name: String): Person_6 = {
    println("apply")
    new Person_6(name)
  }
}
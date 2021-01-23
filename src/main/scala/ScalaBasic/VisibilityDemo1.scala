package ScalaBasic

// https://www.youtube.com/watch?v=t0rVwF5AF4E&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=69

object VisibilityDemo1 extends App {

}

class Person2 {
  // enlarge the package visibility (via private[ScalaBasic])
  // 1. private still works (as below)
  // 2. enlarge package visibility -> all packages under ScalaBasic can use this
  // 3. can also extend to upper layer, e.g. :  private[com.yen.ScalaBasic]  if cases
  private[ScalaBasic] val name = "jackkkk"
}

class A {
  def test01(): Unit = {
    // test
    val p = new Person2
    println(p.name)
  }
}
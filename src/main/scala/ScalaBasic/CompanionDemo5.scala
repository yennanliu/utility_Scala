package ScalaBasic

// https://www.youtube.com/watch?v=6EoW0rcqaDk&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=88

object CompanionDemo5 extends App {

  // run
  val child1 = new Child("kyo")
  val child2 = new Child("iori")
  val child3 = new Child("may")
  val child4 = new Child("andy")

  // join the game
  Child.joinGame(child1)  // Child$.Module$ is a static value
  Child.joinGame(child2)
  Child.joinGame(child3)
  Child.joinGame(child4)

  // show how many players
  Child.showNum()
}


class Child(cName: String ){
  var name:String = cName
}

object Child {
  // create a static value
  // ref : https://github.com/yennanliu/JavaHelloWorld/blob/main/src/main/java/Basics/staticDemo1.java
  var totalNum:Int = 0

  // join the game
  def joinGame(c: Child): Unit = {
    println(c.name + " join game !!!")
    totalNum += 1
  }

  // show how many players
  def showNum(): Unit = {
    println("there are " + totalNum + " players in the game")
  }
}

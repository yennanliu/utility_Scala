package ScalaBasic

object mapOpDemo_2 extends App {

  // example 1 : add one to element
  val list1 = List(1,2,3,4,5,6,7,8)
  val r1 = list1.map( x => {
    val tmp = x
    println ("tmp = " + tmp)
    x + 1
  })

  r1.foreach(println(_))

  println("====================")

  // example 2 : filter even
  val r2 = list1.filter(x => {x % 2 == 0})

  r2.foreach(println(_))

  println("====================")

  // example 3 : flatMap
  val l2 = List("a", "b", "c")
  val r3 = l2.flatMap(_ + "|")
  println("r3 = " + r3)

  println("====================")

  // example 4 : Map & reduce
  // https://www.geeksforgeeks.org/scala-reduce-function/
  val l4 = List("a", "b", "c", "d", "a", "b")
  val r5 = l4.map( x => {
    val tmp = (x,1)
    tmp
  }).reduce( (x,y) => {
    (y._1, x._2)
  })

  println("r5 = " + r5)

  println("====================")

  // example 5 : map with case class
  case class User(
                 id: String,
                 age: Int
                 )
  val user1 = User("001", 20)
  val user2 = User("002", 70)
  val user3 = User("003", 10)

  val users = List(user1, user2, user3)

  val users_filter = users.map(x => x match {
    case _ if x.age > 10 => x
    case _ =>
  })

  users_filter.foreach(println(_))
}

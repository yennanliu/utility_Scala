package ScalaBasic

// https://www.youtube.com/watch?v=6I1nahs8R4E&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=123

object ListDemo_2 extends App {
  // make a list
  // we don't need to import List, Nil
  // since they are declared already in the package object scala
  val list1 = List(1,2,3)
  println("list1 = " + list1)

  // get the element (by index)
  println(list1(0))
  println(list1(1))
  println(list1(2))

  println("=============")

  // make a null List
  val list2 = Nil
  println("list2 = " + list2) // List(), but not null (List() is still a collection)
}

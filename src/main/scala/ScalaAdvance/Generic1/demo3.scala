package ScalaAdvance.Generic1

// https://www.bilibili.com/video/BV12N411R726?p=273&spm_id_from=pageDriver

object demo3 extends App {

  // run
  val list1 = List("dog","cat","ox")
  val list2 = List(7,10,23423)

  println(midList[String](list1)) // cat
  println(midList[Int](list2)) // 10


  // generic type = E
  def midList[E](l:List[E]):E = {
    l(l.length / 2)
  }
}

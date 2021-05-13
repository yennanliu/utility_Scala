package ScalaBasic

// https://www.bilibili.com/video/BV12N411R726?p=224

object mapOPDemo_1 extends App {
  // evolution of map op style
  val list = List(1,2,3,4)

  println(list.map((x:Int) => x +1 ))
  println(list.map( (x)=> x + 1))
  println(list.map(x => x + 1))
  println(list.map( _ + 1 ))

}

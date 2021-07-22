package ScalaBasic

// https://www.bilibili.com/video/BV12N411R726?p=251&spm_id_from=pageDriver

/**
 *   Word Count 1 : map-reduce
 *
 *   given a lines :
 *   val lines = List("hello helo helo helllo", "world, worl, wor, world", "helo, helo")
 *
 *   plz find the counts of each word in the lines
 *   and sorting (from biggest count to smallest)
 *   via default scala ways
 */

object wordCountScala1 extends App {

  val lines = List("hello helo helo helllo", "world orl wor world", "helo helo")

  // step 1) split
  val _line1 = lines.flatMap(s => s.split(" "))
  println(_line1)

  //step 2) map
  val _line2 = _line1.map(x => (x,1))
  println(_line2)

  /** step 3) grouping with same "key" (groupBy) */
  val _line3 = _line2.groupBy((x:(String, Int)) => x._1) // better to explicitly define dtype (dtype here is optional)
  println(_line3)

  // step 4) reduce
  val _line4 = _line3.map((x:(String,List[(String,Int)])) => (x._1, x._2.size))  // better to explicitly define dtype (dtype here is optional)
  println(_line4)

  // step 5) sorting
  //val _line5 = _line4.toList.sortBy(x => -x._2)
  val _line5 = _line4.toSeq.sortBy((x:(String, Int)) => x._2).reverse
  println(_line5)

  //---------------------
  // do above in 1 command
  //---------------------

  val result = lines
    .flatMap(s => s.split(" "))
    .map(x => (x,1))
    .groupBy((x:(String, Int)) => x._1)
    .map((x:(String,List[(String,Int)])) => (x._1, x._2.size))
    .toSeq.sortBy((x:(String, Int)) => x._2).reverse

  println("result = " + result)
}

package ScalaBasic

// https://www.youtube.com/watch?v=BLSSJBV5Rx8&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=50

object ExceptionDemo1 extends App{

  // define some method with Exception
  def test1() = {  throw new Exception("hahahah") }

  // can use this "exception comment" throws exception by cases
  @throws (classOf[Exception]) 
  def test2() = {  throw new Exception("hahahah") }

  @throws (classOf[NumberFormatException]) 
  def test3() = { "abc".toInt }

  // run
  test1()
  test2()
  test3()
}

package ScalaBasic

// https://www.youtube.com/watch?v=6A8rV5bIVjo&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=171

object closure_demo1 extends App {

  /**
   *  Closure
   *
   *  1) Closure is a combination of a func and its relative references
   */

  // example 1
  // the x and anonymous func now as a "closure"
  def minusxy(x: Int) = {
    (y: Int) => x - y // anonymous func
  }

  // example 2
  // Make a func that will return <filename>.jpg if there is no jpg file type
  // it there is (jpg file type), just return it. (e.g. : <filename2>.jpg )
  /**
   *  Closure
   *  1) returned an anonymous func
   *  2) the anonymous func uses external var : suffix
   *  3) the anonymous func + external var (suffix) as a Closure
   */
  def makeSuffix(suffix: String) = {
    // anonymous func
    (name: String) => {
      if (name.endsWith(suffix)) {
        name
      } else {
        name + suffix
      }
    }
  }

  val f1 = makeSuffix(".jpg")
  println( f1("hello"))

  println("================")

  println( f1("abc.jpg"))

  println("================")

  val r2 = makeSuffix(".jpg")("xyz")
  println("r2 = " + r2)
}

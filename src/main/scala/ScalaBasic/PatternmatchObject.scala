package ScalaBasic

// https://www.youtube.com/watch?v=k0Oz8RhsWYI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=154

object PatternmatchObject extends App {
  // run
  val number: Double = 36.0
  val number2: Double = 35.0

  // example 1
  number match {
    /**
     *   Pattern match ob object
     *     1) when case Square(n) , it will call Square's "unapply" method => for getting object
     *        * Note : unapply method's argument (unapply(z: Double)) : z is from 36.0
     *        -> if "unapply" return "some" -> pattern match success
     *        -> if "unapply" return None  ->  pattern match failed
     *    2) once pattern match success -> will give return value to n
     */
    case Square(n) => println(n)
    case _ => println("nothing matched ! ")
  }

  // example 2
  number2 match {
    case Square(n) => println(n)
    case _ => println("nothing matched ! ")
  }

  // example 3
  val n = Square(9.0) // create a Square instance
  n match {
    // will implement Square's unapply method, so it will return 9 (since 9  --apply-> 81, 81--unapply-> 9)
    case Square(n) => println(n)
    case _ => println("nothing matched ! ")
  }

  // here n = Square(9.0), will implement "apply method" automatically, so n = 9 * 9 = 81
  println(s"n = $n")

}

object Square{
  // it's important to make correct unapply, apply method per your biz logic
  def unapply(z: Double): Option[Double] = Some(math.sqrt(z))

  def apply(z: Double): Double = z * z
}

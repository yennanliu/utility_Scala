package ScalaBasic

// https://www.youtube.com/watch?v=Um6YD79OIfU&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=160

/**
 *  Pattern match - nested structure -2
 */

object CaseClass6 extends App {

  // Question : plz design case class for below requirement :
  // 1. product bundle can be single, or multiple products
  // 2. mew_prod_price = prod_price - discount
  // 3. get the results of mew_prod_price of all products in the bundle


  // run0
  val sales0 = Book2("comics", 40)
  println(price(sales0))  // 40

  // run1
  // ---- 1st iteration ----
  // disc = 10
  // it = Bundle2("book", 10, Book2("comics", 40))
  // ts = Book2("comics", 40)
  //
  // ---- 2nd iteration ----
  // disc = 10
  // its = Book2("comics", 40)
  // p = 40
  // 40 - 10 = 30
  //
  // ---- 3rd iteration ----
  // price(sales1) = 30
  val sales1 = Bundle2("book", 10, Book2("comics", 40))
  println(price(sales1))  // 40 - 10 = 30

  // method
  def price(it: Item2): Double = {
    it match {
      // if match Book, -> return price directly
      case Book2(_, p) => p
      // make a new collection, pass every element in its to it in price
      // if match a bundle, then compute the mew_prod_price recursively
      // its.map(price _) : meaning map every element in its to price method, which is the original method (recursion)
      case Bundle2(_, disc, its @ _*) => its.map(price _).sum - disc
    }
  }
}

// abstract class
abstract class Item2

case class Book2(description: String, price: Double) extends Item2

case class Bundle2(described: String, discount: Double, item: Item2*) extends Item2


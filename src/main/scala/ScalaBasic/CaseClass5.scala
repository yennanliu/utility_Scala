package ScalaBasic

// https://www.youtube.com/watch?v=5jDIC75v0uM&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=159
// https://www.youtube.com/watch?v=Um6YD79OIfU&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=160

/**
 *  Pattern match - nested structure
 */

object CaseClass5 extends App {
  // run
  // sales1 is a bundle of products
  // items inside : Book("comics", 40), Bundle("literature", 70, Book("wsj", 90), Book("herry poter", 100))
  // total book price : ( ( (90+100) - 70 ) + 40 ) - 10
  val sales1 = Bundle("book", 10,
    Book("comics", 40),
    Bundle("literature", 70, Book("wsj", 90), Book("herry poter", 100))
  )

  // Question 1 : only extract "comics" price ?
  // if we don't want pattern match collect some values -> use "_" to neglect them
  //  -> _* means everything after that element
  val r = sales1 match {
    case Bundle(_, _, Book(desc, price), _*) => (desc, price)
  }

  println("r = " + r)
  println("price = " + r._2)

  println("=======================")

  // Question 2 : return "comics" and "Bundle" (all items in bundle) via @ notation ?
  /**
   *  @ notation  -> wrap values in case class to variable
   *              -> wrap rest of the items (_*) to rest
   */
  val r2 = sales1 match {
    // wrap Book(_, _) to art
    // wrap _* to rest
    case Bundle(_, _, art @ Book(_, _), rest @ _*) => (art, rest)
  }

  println("r2 = " + r2)
  println("art = " + r2._1 + ", description : " + r2._1.description + ", price : " + r2._1.price)
  println("rest = " + r2._2)

  println("=======================")

  // Question 3
  /**
   * without *, wrap rest elements to variable
   *  (via rest @ _)
   */
  val r3 = sales1 match {
    // wrap Book(_, _) to art
    // wrap _* to rest
    case Bundle(_, _, art @ Book(_, _), rest @ _) => (art, rest)
  }

  println("rest = " + r3._2)
}

// abstract class
abstract class Item

// a case class Book extends from Item, and its constructor : Book(description: String, price: Double)
case class Book(description: String, price: Double) extends Item

// a case class Bundle extends from Item
// its constructor : Bundle(described: String, discount: Double, item: Item*)
//   -> described : explanation for A BUNDLE OF PRODUCT ( a collection)
//   -> discount  : discount for the products in BUNDLE
//   -> item : Item*, bundle of products, NESTED STRUCTURE, can be one book, multiple books, or another Bundle or ...
case class Bundle(described: String, discount: Double, item: Item*) extends Item

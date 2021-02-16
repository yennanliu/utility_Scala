package ScalaBasic

// Abstract Field Override
// https://www.youtube.com/watch?v=Yt3WXQ8UAX4&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=83

object OverrideDemo5 extends App {

  // run
  val b = new BBBBB
  println(b.name)
}

abstract class AAAAA {
  // regular attribution
  var age: Int = 10

  // abstract attribution
  // need to be implemented in the class which extends it (AAAAA)
  // will not have attribution definition under the hood;
  // but will have 2 method under the hood :
  // 1) name()
  // 2) name_$eq()
  var name: String
}

class BBBBB extends AAAAA {
  // implement the abstract name
  // name(), name_$eq() implementation
  // NO NEED TO ADD "override" since it's implementation, not override
  var name: String = _
}
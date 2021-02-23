package ScalaBasic

// https://www.youtube.com/watch?v=6EoW0rcqaDk&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=88

object CompanionDemo4 extends App {

  println("CompanionDemo4 ...")
  // run 1
  // basic attribution, method
  println("ScalaPerson.sex = " + ScalaPerson.sex) // ScalaPerson$.Module$.sex() under the hood
}


/*
 *  1) WHEN WE PUT class and object in the same file with name
 *   -> WE MAKE THE "Companion".
 *   => THE CLASS called  Companion class; while the object called  Companion object
 *
 *  2) In development, we put the basic attribution, method ... in  Companion class
 *  ; and we put the static consents in the  Companion object
 */

// Companion class
class ScalaPerson{ // will have ScalaPerson under the hood, AND WILL HAVE method/op.. for object ScalaPerson
  var name:String = _
}

// Companion object
object ScalaPerson{ // will still have ScalaPerson$ class under the hood
  val sex:Boolean = true
}
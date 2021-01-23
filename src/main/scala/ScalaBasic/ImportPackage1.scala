package ScalaBasic

// https://www.youtube.com/watch?v=O320_73louQ&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=70

// if we want to hide some class when import package
import java.util.{HashMap => _, _} // hide HashMap and import all of the other classes

// if only want to import some classes under the package
import scala.collection.mutable.{HashMap, HashSet}

// rename imported class, avoid name confliction
import java.util.{HashMap => javaHashMap}

object ImportPackage1 extends App {

  // run
  val map = new HashMap
  val set = new HashSet
  println(map)
  println(set)

  val j_map = new javaHashMap
  println(j_map)

}

package ScalaBasic

// https://www.youtube.com/watch?v=VC2ZCp2r2F8&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=161

object CaseClass7 extends App {
  // run
  for (item <- Array(Spring, Autumn)){
    item match {
      case Spring => println("Spring")
      case Autumn => println("Autumn")
      case _ => println("else")
    }
  }

}

// create case class
abstract class Season
case object Spring extends Season
case object Autumn extends Season

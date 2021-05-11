package ScalaBasic

// https://www.youtube.com/watch?v=k0Oz8RhsWYI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=154

object PatternmatchObject2 extends App {
  // run
  val namesString = "Alice,Ken,Amy"
  val namesString2 = "Alice,Ken,Amy,Yuri"

  namesString match{
    // in here, Names(first, second, third)  will call Names' unapply method
    //  -> if return some (pattern match success), will give result to first, second, third
    //  -> if return none -> pattern match failed
    case Names(first, second, third) => {
      println("the string contains 3 names, pattern match OK! ")
      println(s"$first, $second, $third")
    }

    case _ => println("nothing matched !")
  }

  namesString2 match{
    case Names(first, second, third) => {
      println("the string contains 3 names")
      println(s"$first, $second, $third")
    }

    case _ => println("nothing matched !")
  }
}

object Names {
  // if pattern match success -> return Some, else return None
  // Option[Seq[String]] : accept MULTIPLE inputs (multiple string in Seq)
  // +A => List[String] transform to List[Any]
  // -A => List[Any] transform to List[String]
  // A => nothing transformed, the default case we use
  def unapplySeq(str: String): Option[Seq[String]] = {
    if (str.contains(",")) {
      Some(str.split(","))
    } else None
  }
}

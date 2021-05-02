 package ScalaBasic

 // https://www.youtube.com/watch?v=6e-ogP2qVog&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=148

 object PatternmatchDemo4 extends App {
   // run
   for (ch <- "+--3!??987"){ // go through the string
     var sign = 0
     var digit = 0

     // pattern match
     ch match {
       case '+' => sign = 1
       case '-' => sign = -1
       /**
        * 1) if ch.toString.equals("3") is true  -> match !
        * 2) if false -> match failed
        * 3) pattern match "guard" (case if )
        */
       case _ if ch.toString.equals("3") => digit = 3
       case _ if ch.toInt > 4 => println("bigger than 4")
       case _ => sign = 2
     }
     println("ch = " + ch + "  sign = " + sign + " digit = " + digit)
   }

 }

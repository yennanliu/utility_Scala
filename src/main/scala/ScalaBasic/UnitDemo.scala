package ScalaBasic

object UnitDemo extends App {

    /*  In Scala, we call a function as "procedure" if there is no "=" in 
     *  the function. Also, procedure will not return value. We use it for
     *  the sake of its "side effect"
     */

     def box(s : String){
        var border = "=" + s.length + "--\n"
        println(border + "|" + s + "|\n" + border)
     }

    // this style works OK as well
    def box2(s : String): Unit = {
        var border = "=" + s.length + "--\n"
        println(border + "|" + s + "|\n" + border)
     }

     println(box("abc"))
     println(box2("abc"))
    
}
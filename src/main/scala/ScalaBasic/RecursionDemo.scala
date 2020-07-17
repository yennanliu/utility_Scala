package ScalaBasic

object RecursionDemo extends App {
    // define sum func via recursion 
    def sum_recursion(lst : List[Int]): Int = 
        // if list is null -> return 0 
        // else : list's curret first element plus rest of elements
        if (lst == Nil) 0 else lst.head + sum_recursion(lst.tail)

    // define sum func via pattern_match 
    def sum_pattern_match(lst: List[Int]): Int = lst match{
        case Nil => 0
        // :: is scala pattern match
        // https://ithelp.ithome.com.tw/articles/10188670
        case h :: t => h + sum_pattern_match(t) 
    }

    // define sum func via for loop
    def sum_for_loop(lst: List[Int]): Int = {
        var r = 0
        for (i <- lst)
            r += i
        r
    } 

    val a = List(1,2,3)
    println(sum_recursion(a))
    println(sum_pattern_match(a))
    println(sum_for_loop(a))

}
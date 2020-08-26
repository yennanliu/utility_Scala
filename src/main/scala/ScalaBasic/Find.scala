package ScalaBasic

object Find extends App{

    // from scala 2.13.x
    // def isDefined: Boolean  = !isEmpty
    // ...
    // final def nonEmpty = isDefined

    // there are at least 3 ways 
    // to find if an element is in a List
    // ->
    // println(list.find(x => x == target).isDefined)
    // println(list.exists(x => x == target))
    // println(list.contains(target))


    val mylist = List("abc", "one", "two", "xxx", "zzzzz")

    // run
    val target = "abc"
    // to find is target is inside mylist
    println(mylist.find(x => x == target))  // Some(abc)
    mylist.find(target2.contains(_)).isDefined // true 
    
    val target2 = "yyy"
    println(mylist.find(x => x == target2))   // None
    mylist.find(target.contains(_)).isDefined  // true

    println(mylist.find( x => x.length == 5))

    val r = mylist.find( x => x.length == 9)
    println (r)
}
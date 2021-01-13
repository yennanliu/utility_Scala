package ScalaBasic

// https://www.youtube.com/watch?v=KTSKvRjfUlQ&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=62

object ConstructorDemo5 extends App{

  // run 1
  val cat2 = new Cat2("WhiteCat")
  println(cat2.inName)
  // cat2.inName = "lolCat"  <-- will have error, since inName is read only var

  println("------------------------------")

  // run 2
  val cat3 = new Cat3("JimCat")
  println(cat3.inName)
  cat3.inName = "MaryCat"  // equals as cat3.inName_$eq("MaryCat")
  println(cat3.inName)     // equals as cat3.inName()
}

class Cat(inName: String){  // inName is a local var
  var name: String = name
  println(inName)
}

class Cat2(val inName: String){
  var name: String = inName
}

class Cat3(var inName: String){  // use "var" for variable, will have "getter", and "setter" like method as java
  var name: String = inName
}
package ScalaBasic.Seal_1

// https://www.youtube.com/watch?v=UgTdYecO2Wg&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=161

object SealDemo_1 extends App {

}

sealed class A {

}

class B extends A { // this one is OK

}
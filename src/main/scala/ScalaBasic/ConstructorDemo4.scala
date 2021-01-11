package ScalaBasic

// https://www.youtube.com/watch?v=ADyLvAc6yXc&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=60

object ConstructorDemo4 extends App{
  // class MyPerson4 private() (main constructor)is private
  // run 1
  //val p1 = new MyPerson4()   <--- this one will not work, since "private" constructor can not be accessed
  //println(p1)
}

class MyPerson4 private(){
}

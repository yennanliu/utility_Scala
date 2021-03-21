package ScalaBasic

// revisit TraitDemo8
// https://www.youtube.com/watch?v=7pp9g6EEXlg&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=100

object TraitDemo9 extends App {
  // run
  val tr_9 = new myClass with trait_test_9_1
  //tr_9.halo()
}

class myClass{}

trait my_trait_9_1 {
  def halo():Unit = {
    println("my_trait_9_1 's halo")
  }
}

trait trait_test_9_1 extends my_trait_9_1 {
  override def halo(): Unit = {
    println("trait_test_9_1 's halo")
  }

  /** user its "direct parent's" (Data5) insert method (can only put "direct parent" in generic type )*/
  super[my_trait_9_1].halo()
}



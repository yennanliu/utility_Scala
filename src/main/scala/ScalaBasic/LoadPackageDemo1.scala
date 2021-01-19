package ScalaBasic

// https://www.youtube.com/watch?v=bAEjSxTR-jk&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=65

import PackageDev.David
import PackageDev.Jack

object LoadPackageDemo1 extends App{

  // run 1
  // use David.dog
  val dog1 = new David.Dog
  // use Jack.dog
  val dog2 = new Jack.Dog
  println("dog 1 = " + dog1)
  println("dog 2 = " + dog2)
}


// https://www.youtube.com/watch?v=k716VNCSLNE&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=68

package ScalaBasic {

  /* package object oa will make below two files under ScalaBasic package:
   *  1) package.class
   *  2) package$.class
   *  when we run "sayOK" method, it actually call the static method package$.class
   */
  package object oa {  // package object oa and package oa need to be under the same "package ScalaBasic "
    def sayOK: Unit = {
      println("say OKKKKKKKK")
    }

    val value = 100.01
  }

  package oa {
    object A{
      def main(args: Array[String]): Unit = {
        // run
        sayOK // equal as : MODULE$sayOK in the package$.class under the hood
        println(value) // equal as : MODULE$sayOK.value() in the package$.class under the hood
      }
    }
  }
}

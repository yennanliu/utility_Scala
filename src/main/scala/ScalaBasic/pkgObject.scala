
// https://www.youtube.com/watch?v=k716VNCSLNE&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=68

package ScalaBasic {

  /* package object oa will make below two files under ScalaBasic package:
   *  1) package.class
   *  2) package$.class
   *  when we run "sayOK" method, it actually call the static method package$.class
   */
  package object oa {
    def sayOK: Unit = {
      println("say OKKKKKKKK")
    }
  }

  package oa {
    object A{
      def main(args: Array[String]): Unit = {
        // run
        sayOK
      }
    }
  }
}

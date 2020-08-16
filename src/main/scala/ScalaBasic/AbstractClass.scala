// https://www.youtube.com/watch?v=ONmBOPgTKYw
// https://docs.scala-lang.org/overviews/scala-book/abstract-classes.html

package ScalaBasic

object AbstractClass{

    def main(args: Array[String]){
        /*
         * example 1
         */
        // Item is a abstract class
        abstract class Item
        // extends abstract class
        case class Article(description: String, price: Double) extends Item
        case class Bundle(description: String, discount: Double, item: Item*) extends Item

        // test
        val bundle_a  = Bundle("father's day special", 20.0 )  // no need to add "new"
        val article_a  = Article("scala is good!", 99.99 )
        println(bundle_a)
        println(article_a)
        
        /*
         * example 2
         */
        abstract class Polygon{
            def area: Double
        }
        // extends abstract class
        class Rectangle(var width: Double, var height: Double) extends Polygon{
            def area = width * height
        }

        val myarea = new Rectangle(3,4)
        println(myarea.area)

        /*
         * example 3
         */

         // Regarding the second point — the second time when you’ll need to use an abstract class — because Java doesn’t know anything about Scala traits, if you want to call your Scala code from Java code, you’ll need to use an abstract class rather than a trait.

         abstract class Pet(name: String){
            def speak(): Unit = println("YOOOOO")
            def cometoMaster(): Unit
         }

         class Dog(name: String) extends Pet(name){
            override def speak() = println("wooooof")
            def cometoMaster() = println("here i am coming")
         }

          // run
          val d = new Dog("rover")
          d.speak
          d.cometoMaster

          abstract class Pet2(name: String){
            def speak: Unit = println(s"my name is : $name")
          }

          class Dog2(name: String) extends Pet2(name)

          val dd = new Dog2("fifo dido")
          d.speak


        /*
         * example 4 : MY PRACTICE
         */

         // TODO : 1) fix to override all methods in User,  2) init User class inside NormalUser (?)

         abstract class User(name: String, id: Int){
            def shout(): Unit = println("i am an user!")
            //def login(): String
            // def getName(): String
         }

         class NormalUser(name: String, id: Int) extends User(name, id){

            def shout(name: String): Unit = println(s"this is user : $name")

            def login(id: Int): String = id match{
                case id if id > 0 => "login OK!"
                case _  => "login failed"
            }

            def getName(name: String): String = name

         }

         val tom = new NormalUser("tom", 777)
         tom.shout("tom")
         tom.login(777)
         tom.getName("tom")
    }
}
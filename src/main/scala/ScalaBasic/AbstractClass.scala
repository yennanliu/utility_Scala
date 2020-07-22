// https://www.youtube.com/watch?v=ONmBOPgTKYw

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

    }
}
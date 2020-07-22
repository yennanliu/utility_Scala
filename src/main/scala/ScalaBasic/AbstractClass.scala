package ScalaBasic

object AbstractClass{

    def main(args: Array[String]){  
        abstract class Item
        case class Article(description: String, price: Double) extends Item
        case class Bundle(description: String, discount: Double, item: Item*) extends Item

        // test
        val bundle_a  = Bundle("father's day special", 20.0 )  // no need to add "new"
        val article_a  = Article("scala is good!", 99.99 )
        println(bundle_a)
        println(article_a)
        
    }
}
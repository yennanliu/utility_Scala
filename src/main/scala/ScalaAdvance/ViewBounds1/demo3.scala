package ScalaAdvance.ViewBounds1

// https://www.bilibili.com/video/BV12N411R726?p=279&spm_id_from=pageDriver

/** View bounds demo 3 : with implicit func */

// import implicit func
import MyImplicit._

// entry point
object demo3 extends App {

  val p1 = new Person3("tim", 7)
  val p2 = new Person3("jim", 40)

  val compareComm3 = new CompareComm3(p1, p2)

  println(compareComm3.getter)
}


/** NOTE :
 *  since we made & import our implicit func (`MyImplicit._`) here,
 *  -> so here Person3 DOESN'T need to extend Ordered[T] anymore
 */
class Person3(val name:String, val age:Int){

  override def toString: String = {
    this.name + "\t" + this.age
  }
}

class CompareComm3[T <% Ordered[T]](obj1:T, obj2:T){

  def getter = {
    if (obj1 > obj2) obj1 else obj2
  }

  def getter2 = {
    if (obj1.compareTo(obj2) > 0) obj1 else obj2
  }
}

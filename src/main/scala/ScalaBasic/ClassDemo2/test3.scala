package ScalaBasic.ClassDemo2

object test3 extends App {
  // run
  DB.connectDB
  //println(DB.toString)
}

class DB {
  // attr
  var host: String = _
  var port: Int = _
  var user: String = _

  // constructor
  def this(host: String, port: Int, user: String){
    this
    this.host = host
    this.port = port
    this.user = user
  }

  override def toString: String = {
  s"host = $host | port = $port | user = $user"
  }

}

object DB{
  def connectDB = {
    val db = new DB("127.0.0.1", 3006, "123")
    println("db = " + db)
    println("connect to DB ...")
  }
}

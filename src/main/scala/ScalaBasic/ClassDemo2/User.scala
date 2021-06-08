package ScalaBasic.ClassDemo2

class User {
  // attr
  var id: String = _
  var name: String = _
  var age: Int = _

  // constructor
  def this(id: String, name: String, age: Int){
    this
    this.id = id
    this.name = name
    this.age = age
  }
}

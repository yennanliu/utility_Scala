package ScalaBasic.CustomerCRM.bean

// https://www.youtube.com/watch?v=WUPrKqXyI30&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=177

class Customer {
  // attr
  var id: Int = _
  var name: String = _
  var gender: Char = _
  var age: Short = _
  var tel: String = _
  var email : String = _

  // constructor
  def this(id: Int, name: String, gender: Char, age: Short, tel: String, email: String){
    this // this is necessary
    this.id = id
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }

  // method
  // rewrite Customer's toString method
  override def toString: String = {
    id + "\t\t" + name + "\t\t" + gender + "\t\t" + age + "\t\t" + tel + "\t\t" + email + "\t\t"
  }
}

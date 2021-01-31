package ScalaBasic

object encapsulationDemo1 extends App{

  // run
  val p1 = new Person_new
  p1.setAge(20)
  println("p1.age = " + p1.getAge())
  
  p1.setAge(140)
}

class Person_new{
  // attribution
  var name:String = _
  // make age as private so it can not be modified
  private var age: Int = _ // under the hood, it also has corresponding age, age_$eq, but there are private

  // method
  def setAge(age: Int): Unit = {
    if (age <= 0 || age > 120){
      println("input age is not valid, set as default value")
      this.age = 20
    } else{
      this.age = age
    }
  }

  def getAge(): Int ={
    this.age
  }
}

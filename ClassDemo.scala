object ClassDemo {

  def main(args: Array[String]) {

    var s = new Student1();
    println("Student1")
    println("id : " + s.id + "\n" + "name : " + s.name);

    var s2 = new Student2(101, "Raju");
    println("Student2")
    s2.show();

    var c = new Car();
    println("Car1")
    println("type : " + c.v_id + "\n" + "price : " + c.price)
  }

  class Student1 {
    var id: Int = 10;
    var name: String = null;
  }

  class Student2(id: Int, name: String) {

    def show() {
      println(id + " " + name)
    }
  }

  class Car {
    var v_id: Int = 10;
    var price: Int = 999;
  }

}

package ScalaBasic

object thisDemo extends App {

    // example 1
    class ThisExample{
    var id = 0 
    var name = ""
    def this(id: Int, name:String){
        this()
        this.id = id
        this.name = name
    }
    def show(){
        println(id + " " +name)
        }
    }
    val demo = new ThisExample(777, "jim")
    println(demo.show())

    // example 2 
    class Student(name: String){
        def this(name: String, age: Int){
            this(name)
            println(name + " " + age)
        }
    }

    val demo2 = new Student("kim", 999)
    println(demo2)

}
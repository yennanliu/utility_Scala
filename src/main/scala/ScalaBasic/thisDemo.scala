package ScalaBasic

// https://www.includehelp.com/scala/this-keyword-in-scala.aspx

object thisDemo extends App {

    // example 1
    class ThisExample{
    var id = 0 
    var name = ""
    def this(id: Int, name: String){
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

    // example 3 : With (.) dot operator
    class teachers{
        var name = ""
        var marks = 0 
        def info(name: String, marks: Int){
            this.name = name
            this.marks = marks
        }
        def show(){
            println("teachers " + name + " has obtained  " + marks  + " marks")
        }  
    }

    val demo3 = new teachers()
    demo3.info("amy", 333)
    println(demo3.show())

    //example 4 : Using this()
    class teachers2{
        var name =  ""
        var marks = 0 
        def this(name: String, marks: Int){
            this()
            this.name = name
            this.marks = marks
        }
        def show(){
            println("teachers " + name + " has obtained  " + marks  + " marks")
        }
    }

    val demo4 = new teachers2("kate", 555)
    println(demo4.show())

}
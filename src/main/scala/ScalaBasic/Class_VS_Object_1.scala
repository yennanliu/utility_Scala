package ScalaBasic

// https://stackoverflow.com/questions/1755345/difference-between-object-and-class-in-scala
// https://www.datacamp.com/community/tutorials/scala-classes-objects?utm_source=adwords_ppc&utm_campaignid=1455363063&utm_adgroupid=65083631748&utm_device=c&utm_keyword=&utm_matchtype=b&utm_network=g&utm_adpostion=&utm_creative=332602034364&utm_targetid=dsa-429603003980&utm_loc_interest_ms=&utm_loc_physical_ms=1012825&gclid=CjwKCAjwrKr8BRB_EiwA7eFapjFFue84dBIDINZuo0Rh5QtS88FW9mpJM4h_O2MEkYxV7GJJBfNtqRoCGyIQAvD_BwE

object Class_VS_Object_1 extends App{

    object UtilsOBJ{

        val x = 100
        val y = 200
        val z = 300
        
        def plus_100(x: Int): Int = x + 100

        def get_sum(x: Int, y: Int):Int = { x + y }

        def println_(input:String):Unit = {
            println( input.toString() )
        }
    }

    class UtilsClass{

        val a = 100
        val b = 200
        val c = 300
        
        def plus_100(x: Int): Int = x + 100

        def get_sum(x: Int, y: Int):Int = { x + y }

        def println_(input:String):Unit = {
            println( input.toString() )
        }

        def twice(i: Int): Int = 2*i
    }


    // run

    // Object
    // 1) object O creates a singleton object O as instance of some anonymous class; it can be used to hold static members that are not associated with instances of some class.
    // 2) no need to instantiate, can use directly
    // 3) can be extended : object O extends T makes the object O an instance of trait T; you can then pass O anywhere, a T is expected
    //    -> object as host of static members
    // 4) the "apply" feature
    // 5) can not provide constructor parameters for Objects
    // 6) Object is not a type - you may not create an instance with new operator. But it can have fields, methods, extend a superclass and mix in traits.
    println(UtilsOBJ.x)
    println(UtilsOBJ.y)
    println(UtilsOBJ.plus_100(999))

    // Class
    // 1) class C defines a class
    // 2) need to instantiate
    // 3) can has mutiple instances of the same class
    val utils_class = new UtilsClass
    println(utils_class.a)
    println(utils_class.b)
    println(utils_class.plus_100(888))

    val utils_class2 = new UtilsClass
    println(utils_class2.plus_100(888))

}
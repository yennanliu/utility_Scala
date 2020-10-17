package ScalaBasic

// https://stackoverflow.com/questions/1755345/difference-between-object-and-class-in-scala
// https://www.datacamp.com/community/tutorials/scala-classes-objects?utm_source=adwords_ppc&utm_campaignid=1455363063&utm_adgroupid=65083631748&utm_device=c&utm_keyword=&utm_matchtype=b&utm_network=g&utm_adpostion=&utm_creative=332602034364&utm_targetid=dsa-429603003980&utm_loc_interest_ms=&utm_loc_physical_ms=1012825&gclid=CjwKCAjwrKr8BRB_EiwA7eFapjFFue84dBIDINZuo0Rh5QtS88FW9mpJM4h_O2MEkYxV7GJJBfNtqRoCGyIQAvD_BwE

object Class_VS_Object_2 extends App{

    // run
    // object :  No need to create object.
    SingletonObject.hello()
    // class : need to instantiate first
    val comapanion_class = new ComapanionClass
    comapanion_class.hello()


    object SingletonObject{  
        def hello(){  
            println("Hello, This is Singleton Object")  
        }  
    } 

    class ComapanionClass{  
        def hello(){  
            println("Hello, this is Companion Class.")  
        }  
    }   

}
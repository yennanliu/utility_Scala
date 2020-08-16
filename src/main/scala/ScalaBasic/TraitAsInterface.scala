// https://docs.scala-lang.org/overviews/scala-book/traits-interfaces.html

package ScalaBasic

object TraitAsInterface extends App{

    // That code declares a trait named TailWagger that states that any class that extends TailWagger should implement startTail and stopTail methods. Both of those methods take no input parameters and have no return value.
    trait TailWagger{
        def startTail(): Unit
        def endTail(): Unit
    }

    class Dog1 extends TailWagger{
        def startTail(): Unit = println("tail is wagging")
        def endTail(): Unit = println("tail is stopped")
    }

    // let's define more traits
    trait Speaker{
        def speak(): String
    }

    trait Runner{
        def startRunning(): Unit
        def stopRunning(): Unit
    }

    class Dog2 extends Speaker with TailWagger with Runner{
        // Speaker
        def speak(): String = "woooof !"
        
        // TailWagger
        def startTail(): Unit = println("tail is wagging")
        def endTail(): Unit = println("tail is stopped")

        // Runner
        def startRunning(): Unit = println("i am running !")
        def stopRunning(): Unit = println("stopped running")

    }

    // run
    val lucky = new Dog2
    lucky.speak
    lucky.startTail
    lucky.endTail
    lucky.startRunning
    lucky.stopRunning
}


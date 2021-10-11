package ScalaAdvance.UpperBounds1

// https://www.bilibili.com/video/BV12N411R726?p=275

// entry point
object demo2{

  // run
  def main(args: Array[String]): Unit = {

    biological(Seq(new Bird, new Bird))

    println("==============")

    biological(Seq(new Animal, new Animal))

    println("==============")

    biological(Seq(new Animal, new Bird))

    //biological(Seq(new Earth, new Earth)) // wrong, since Earth is NOT Animal's sub type. error msg : Error:(17, 5) inferred type arguments [ScalaAdvance.UpperLowerBounds1.Earth] do not conform to method biological's type parameter bounds [T <: ScalaAdvance.UpperLowerBounds1.Animal biological(Seq(new Earth, new Earth))
  }

  // method
  def biological[T <: Animal](things: Seq[T]) = {
    things.map(_.sound)
  }
}


class Earth{
  // method
  def sound(): Unit ={
    println("hello")
  }
}

class Animal extends Earth{
  // method
  override def sound(): Unit = {
    println("animal sounds")
  }
}

class Bird extends Animal{
  // method
  override def sound(): Unit = {
    println("bird sounds")
  }
}

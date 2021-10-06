package ScalaBasic

import scala.collection.mutable.ListBuffer
//import org.apache.kafka.clients.consumer.{ConsumerRecord, ConsumerRecords, KafkaConsumer, OffsetAndTimestamp}

object CaseClass9 extends App {

  /** demo 1 : init data with case class */
  val my_data = myClass_9(ListBuffer(1,2,3), "123", new myConsumerRecord("hi!!", 123))

  println(my_data)
  println(my_data.a)
  println(my_data.b)
  println(my_data.c)

  println(1.toString)

  val val1 = new myConsumerRecord(x="hi!!", y=123)
  println(val1.x)
  println(val1.y)

  println("=================================")

  /** demo 2 : put data into ListBuffer */
  // loop
  val my_data_set = ListBuffer(
    myClass_9(ListBuffer(1,2,3), "123", new myConsumerRecord("hi!!", 123)),
    myClass_9(ListBuffer(4,5,6), "456", new myConsumerRecord("hi!!", 123)),
    myClass_9(ListBuffer(7,8,9), "789", new myConsumerRecord("hi!!", 123))
  )

  println("my_data_set = " +  my_data_set)

  println("=================================")

  /** demo 3 : implement map on ListBuffer */
  // map
  val my_data_set2 = my_data_set.map{
    x => {
      myClass_9(x.a :+100,x.b+1, x.c)  // put transformed values into myClass_9 case class
    }
  }

  println("my_data_set2 =  " + my_data_set2)
}

// user defined class
class myConsumerRecord{
  // attr
  var x:String = _
  var y:Int = _

  // constructor
  // https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/ClassDemo2/User.scala
  def this(x:String, y:Int){
    this
    this.x = x
    this.y = y
  }
}

// user defined case class
case class myClass_9 (
                   a:ListBuffer[Int],
                   b:String,
                   c:myConsumerRecord
                   )
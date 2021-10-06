package ScalaBasic

import scala.collection.mutable.ListBuffer
//import org.apache.kafka.clients.consumer.{ConsumerRecord, ConsumerRecords, KafkaConsumer, OffsetAndTimestamp}

object CaseClass9 extends App {

  // run
  // init
  val my_data = myClass_9(ListBuffer(1,2,3), "123", new myConsumerRecord("hi!!", 123))

  println(my_data)
  println(my_data.a)
  println(my_data.b)
  println(my_data.c)

  println(1.toString)
}

class myConsumerRecord(x:String, y:Int)

case class myClass_9 (
                   a:ListBuffer[Int],
                   b:String,
                   c:myConsumerRecord
                   )
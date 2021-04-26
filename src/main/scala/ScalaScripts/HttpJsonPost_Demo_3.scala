package ScalaScripts

import java.io.PrintWriter
import java.net.ServerSocket
import java.util.Random
import java.time.LocalDateTime

import com.google.gson.Gson

// https://github.com/yennanliu/NYC_Taxi_Pipeline/blob/master/src/main/scala/TaxiEvent/CreateBasicTaxiEvent.scala

object HttpJsonPost_Demo_3 extends App {
  val port = 9999
  val viewsPerSecond = 10
  val sleepDelayMs = (1000.0 / viewsPerSecond).toInt
  val listener = new ServerSocket(port)
  println(s"Listening on port: $port")

  case class taxiEvent(id: Int, event_date: Long, tour_value: Double, id_driver: Int, id_passenger: Int)

  while (true) {
    val socket = listener.accept()
    new Thread() {
      override def run(): Unit = {
        println(s"Got client connected from: ${socket.getInetAddress}")
        val out = new PrintWriter(socket.getOutputStream(), true)
        while (true) {

          val topic = "payment"
          val r = scala.util.Random
          val id = r.nextInt(10000000)
          val tour_value = r.nextDouble() * 100
          val id_driver = r.nextInt(10)
          val id_passenger = r.nextInt(100)
          val event_date = System.currentTimeMillis

          val payload = new taxiEvent(id, event_date, tour_value, id_driver, id_passenger)

          Thread.sleep(sleepDelayMs)
          val msgDataJson = new Gson().toJson(payload)
          println("*** msgDataJson = " + msgDataJson.toString)
          out.write(msgDataJson)
          out.flush()
        }
        socket.close()
      }
    }.start()
  }
}

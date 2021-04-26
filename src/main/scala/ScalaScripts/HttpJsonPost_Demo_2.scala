package ScalaScripts

import java.io._
import org.apache.commons._
import org.apache.http._
import org.apache.http.client._
import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.DefaultHttpClient
import java.util.ArrayList
import org.apache.http.message.BasicNameValuePair
import org.apache.http.client.entity.UrlEncodedFormEntity
import com.google.gson.Gson

import java.time.LocalDateTime

case class msg(clientId: String, time: LocalDateTime, msg: String)

object HttpJsonPost_Demo_2 extends App {

  // create our object as a json string
  val msgData = new msg("id001", LocalDateTime.now(), "this is msg")
  val msgDataJson = new Gson().toJson(msgData)

  val post = new HttpPost("http://localhost:9999")
  val nameValuePairs = new ArrayList[NameValuePair]()
  nameValuePairs.add(new BasicNameValuePair("JSON", msgDataJson))
  post.setEntity(new UrlEncodedFormEntity(nameValuePairs))

  val client = new DefaultHttpClient

  var counter = 0
  while (true){
    println("counter = " + counter)
    val response = client.execute(post)
    counter += 1
    Thread.sleep(50)
  }

}

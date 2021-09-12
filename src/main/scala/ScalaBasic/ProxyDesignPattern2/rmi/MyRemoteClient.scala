package ScalaBasic.ProxyDesignPattern2.rmi

import java.rmi.Naming

// https://www.bilibili.com/video/BV12N411R726?p=267&spm_id_from=pageDriver

/**
 * Note :
 * plz run the server first (MyRemoteImplement), so the client can get result from service via RMI call
 */

class MyRemoteClient{
  def go() = {
    val service = Naming.lookup("rmi://127.0.0.1:9999/RemoteHello").asInstanceOf[MyRemote]
    val str = service.sayHello()
    println("str = " + str)
  }
}

// entry point
object MyRemoteClient {
  def main(args: Array[String]): Unit = {
    new MyRemoteClient().go()
  }
}

package ScalaBasic.ProxyDesignPattern2.rmi

import java.rmi.Naming
import java.rmi.registry.{LocateRegistry, Registry}
import java.rmi.server.UnicastRemoteObject

// https://www.bilibili.com/video/BV12N411R726?p=267&spm_id_from=pageDriver

// implement MyRemote trait
class MyRemoteServer extends UnicastRemoteObject with MyRemote {
  override def sayHello(): String = {
    "hello world :p :p :p"
  }
}

// register our service (sayHello)
object MyRemoteServer{
  def main(args: Array[String]): Unit = {

    val service:MyRemote = new MyRemoteServer()

    /**
     *  Register method 0
     *    - https://blog.csdn.net/ZT7524/article/details/103424260
     */
    // binding the service with port 9999
    val registry: Registry = LocateRegistry.createRegistry(9999)
    registry.rebind("RemoteHello", service)

    /** Register method 1 */
    //LocateRegistry.createRegistry(9999)
    //Naming.rebind("RemoteHello", service)

    /** Register method 2 */
    //Naming.rebind("rmi://127.0.0.1:9999/RemoteHello", service)
    //println("remote service launch, at 127.0.0.1 with port 9999")
  }
}

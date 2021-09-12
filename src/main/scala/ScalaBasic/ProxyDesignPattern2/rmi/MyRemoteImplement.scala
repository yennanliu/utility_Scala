package ScalaBasic.ProxyDesignPattern2.rmi

import java.rmi.Naming
import java.rmi.registry.LocateRegistry
import java.rmi.server.UnicastRemoteObject

// https://www.bilibili.com/video/BV12N411R726?p=267&spm_id_from=pageDriver

class MyRemoteImplement extends UnicastRemoteObject with MyRemote {
  override def sayHello(): String = {
    "hello world :p :p :p"
  }
}

object MyRemoteImplement{
  def main(args: Array[String]): Unit = {
    val service:MyRemote = new MyRemoteImplement()
    // binding the service with port 9999
    //LocateRegistry.createRegistry(9999)
    //Naming.rebind("RemoteHello", service)
    Naming.rebind("rmi://127.0.0.1:9999/RemoteHello", service)
    println("remote service launch, at 127.0.0.1 with port 9999")
  }
}

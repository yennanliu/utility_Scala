package ScalaBasic.ProxyDesignPattern2.rmi

import java.rmi.{Remote, RemoteException}

// https://www.bilibili.com/video/BV12N411R726?p=267&spm_id_from=pageDriver

// a trait, will be used in local and remote
trait MyRemote extends Remote{

  // method
  // (an abstract method)
  @throws(classOf[RemoteException])
  def sayHello():String // throws RemoteException
}

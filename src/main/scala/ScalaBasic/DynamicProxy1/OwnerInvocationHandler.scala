package ScalaBasic.DynamicProxy1

// https://www.bilibili.com/video/BV12N411R726?p=270&spm_id_from=pageDriver

import java.lang.reflect.{InvocationHandler, Method}

// proxy used by ourselves
class OwnerInvocationHandler extends InvocationHandler{

  // attr
  // the instance is going to be called
  var person:PersonBean = _

  // constructor
  def this(person:PersonBean){
    this
    this.person = person
  }

  // method
  /**
   *  1) the proxy here will work with OwnerInvocationHandler together
   */
  @throws(classOf[Throwable])
  override def invoke(proxy: scala.Any, method: Method, args: Array[AnyRef]): AnyRef = {

    // if `get` method, then we invoke directly
    if (method.getName().startsWith("get")){
      return method.invoke(person)

    // we CAN NOT score ourselves (setScore)
    } else if (method.getName().equals("setScore")){
      return new IllegalAccessException()

    // if `set` method, then we invoke directly
    } else if (method.getName().startsWith("set")){
      return method.invoke(person, args(0).toString)
    }
    null
  }
}

package ScalaBasic.DynamicProxy1

// https://www.bilibili.com/video/BV12N411R726?p=270&spm_id_from=pageDriver

import java.lang.reflect.{InvocationHandler, Method}

// proxy used by OTHER USERS
class NonOwnerInvocationHandler extends InvocationHandler{

  // attr
  var person:PersonBean = _

  // constructor
  def this(person:PersonBean) {
    this
    this.person = person
  }

  // method
  @throws(classOf[Throwable])
  override def invoke(proxy: Any, method: Method, args: Array[AnyRef]): AnyRef = {

    // if `get` method, then we invoke directly
    if (method.getName().startsWith("get")){
      return method.invoke(person)

    // *** OTHER USERS can use below methods (setScore)
    } else if (method.getName().equals("setScore")){
      return method.invoke(person, Integer.valueOf(args(0).toString))

    // OTHER USERS CAN'T use set method
    } else if (method.getName().equals("set")){
      return new IllegalAccessException()
    }
    null
  }
}

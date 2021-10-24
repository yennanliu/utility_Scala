package ScalaAdvance.ViewBounds1

// https://www.bilibili.com/video/BV12N411R726?p=279&spm_id_from=pageDriver

object MyImplicit {

  implicit def person3toOrderedPerson3(p3:Person3) = new Ordered[Person3] {
    override def compare(that: Person3): Int = {
      // implement the biz logic here
      p3.age - that.age
    }
  }
}

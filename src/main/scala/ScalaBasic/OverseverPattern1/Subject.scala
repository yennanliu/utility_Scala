package ScalaBasic.OverseverPattern1

// https://www.bilibili.com/video/BV12N411R726?p=263

// Subject trait
trait Subject {

  // register
  def registerObserver(o: Observer)

  // remove
  def removeObserver(o: Observer)

  // notify
  def notifyObserver()
}

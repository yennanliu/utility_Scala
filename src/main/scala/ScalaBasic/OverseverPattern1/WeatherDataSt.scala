package ScalaBasic.OverseverPattern1

import scala.collection.mutable.ListBuffer

// https://www.bilibili.com/video/BV12N411R726?p=263

class WeatherDataSt extends Subject {

  // attr
  private var mTemperature: Float = _
  private var mPressure: Float = _
  private var mHumidity: Float = _
  // define a group, for observer management
  private val mObservers: ListBuffer[Observer] = ListBuffer()

  // method
  def getTemperature() = {
    mTemperature
  }

  def getPressure() = {
    mPressure
  }

  def getHumidity() = {
    mHumidity
  }

  // update the latest data to the bulletin board
  def dataChange() = {
    //once weather changed, notify all observers
    notifyObserver()
  }

  // set up latest weather conditions (when weather changed)
  def setData(mTemperature:Float, mPressure:Float, mHumidity:Float) = {
    this.mTemperature = mTemperature
    this.mPressure = mPressure
    this.mHumidity = mHumidity

    // modify the weather data per changes
    dataChange()
  }

  // register
  override def registerObserver(o: Observer): Unit = {
    // add to mObservers
    mObservers.append(o)

  }

  // remove
  override def removeObserver(o: Observer): Unit = {
      if (mObservers.contains(o)){
        // remove from mObservers
        mObservers -= o
      }
  }

  // notify all observers, if weather changed
  override def notifyObserver(): Unit = {
    for (observer <- mObservers){
      observer.update(this.mTemperature, this.mPressure, this.mHumidity)
    }
  }
}

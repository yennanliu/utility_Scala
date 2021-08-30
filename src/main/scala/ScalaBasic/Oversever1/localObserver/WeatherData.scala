package ScalaBasic.Oversever1.localObserver

// https://www.bilibili.com/video/BV12N411R726?p=262

/**
 *  this class offering weather data, maintained by Bureau of Meteorology
 */
class WeatherData {

  // attr
  private var mTemperature: Float = _
  private var mPressure: Float = _
  private var mHumidity: Float = _
  private var mCurrentConditions: CurrentConditions = _

  // constructor
  // pass CurrentConditions as args when create weatherData instance
  def this(mCurrentConditions: CurrentConditions) = {
    this
    this.mCurrentConditions = mCurrentConditions
  }

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
    mCurrentConditions.update(getTemperature(), getPressure(), getHumidity())
  }

  // set up latest weather conditions
  def setData(mTemperature:Float, mPressure:Float, mHumidity:Float) = {
    this.mTemperature = mTemperature
    this.mPressure = mPressure
    this.mHumidity = mHumidity

    // modify the weather data per changes
    dataChange()
  }
}

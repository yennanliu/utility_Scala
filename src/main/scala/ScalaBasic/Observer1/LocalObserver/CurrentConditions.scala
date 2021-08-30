package ScalaBasic.Observer1.LocalObserver

// https://www.bilibili.com/video/BV12N411R726?p=262

/**
 *  Bureau of Meteorology's bulletin board
 */
class CurrentConditions {
  // attr
  private var mTemperature: Float = _
  private var mPressure: Float = _
  private var mHumidity: Float = _

  // method
  def display() = {
    println("*** Today's mTemperature = " + mTemperature )
    println("*** Today's mPressure = " + mPressure )
    println("*** Today's mHumidity = " + mHumidity )
  }

  def update(mTemperature:Float, mPressure:Float, mHumidity:Float) = {
    // update weather bulletin board
    this.mTemperature = mTemperature
    this.mPressure = mPressure
    this.mHumidity = mHumidity
    // show
    display()
  }
}

package ScalaBasic.OverseverPattern1

// https://www.bilibili.com/video/BV12N411R726?p=263

class myCurrentConditions1 extends Observer {

  // attr
  private var mTemperature: Float = _
  private var mPressure: Float = _
  private var mHumidity: Float = _

  // method
  def display() = {
    println("*** myCurrentCondition : Today's mTemperature = " + mTemperature )
    println("*** myCurrentCondition: Today's mPressure = " + mPressure )
    println("*** myCurrentCondition: Today's mHumidity = " + mHumidity )
  }

  override def update(mTemperature: Float, wPressure: Float, mHumidity: Float) = {
    // update weather bulletin board
    this.mTemperature = mTemperature
    this.mPressure = mPressure
    this.mHumidity = mHumidity
    // show
    display()
  }
}

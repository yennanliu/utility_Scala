package ScalaBasic.OverseverPattern1

// https://www.bilibili.com/video/BV12N411R726?p=263

trait Observer {

  // abstract method, other observers will implement this method
  def update(mTemperature: Float, wPressure: Float, mHumidity: Float)
}

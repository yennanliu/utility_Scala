package ScalaBasic.Oversever1.localObserver

// https://www.bilibili.com/video/BV12N411R726?p=262

object InternetWeather extends App {

  // create Bureau of Meteorology's bulletin board
  val mCurrentConditions = new CurrentConditions()

  // create mWeatherData, and put mCurrentConditions in
  val mWeatherData = new WeatherData(mCurrentConditions)

  // update latest weather data
  mWeatherData.setData(30,150,40)
}

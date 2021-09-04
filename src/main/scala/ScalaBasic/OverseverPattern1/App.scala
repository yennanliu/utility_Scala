package ScalaBasic.OverseverPattern1

// https://www.bilibili.com/video/BV12N411R726?p=263

// main program
object App extends App {

  /** bulletin 1 */
  // create Bureau of Meteorology's bulletin board
  val mCurrentConditions = new CurrentConditions()

  // create mWeatherData, and put mCurrentConditions in
  val WeatherDataSt = new WeatherDataSt

  // register
  WeatherDataSt.registerObserver(mCurrentConditions)

  // update latest weather data
  //WeatherDataSt.setData(30,150,40)

  /** bulletin 2 */
  // create myCurrentConditions1 weather bulletin
  val myCurrentConditions1 = new myCurrentConditions1
  WeatherDataSt.registerObserver(myCurrentConditions1)


  WeatherDataSt.setData(200,99,77)
}

package ScalaBasic.OverseverPattern1

// https://www.bilibili.com/video/BV12N411R726?p=263

/**
 *  Main program
 *
 *  1) Note that WE DON'T NEED TO CHANGE SOURCE CODE
 *     WHEN ADD A NEW OBSERVER, ALL WE MEED TO DO IS :
 *     1-1) DEFINE A NEW BULLETIN (e.g. CurrentConditions or myCurrentConditions1)
 *     1-2) REGISTER THEM (WeatherDataSt.registerObserver)
 *     1-3) THEN WE CAN SEND THE UPDATED DATA TO ALL OBSERVERS
 */
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

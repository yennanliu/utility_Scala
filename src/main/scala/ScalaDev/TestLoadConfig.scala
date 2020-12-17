package ScalaDev

import com.typesafe.config.ConfigFactory
import common.AppConfig
import common.AppConfigClass

object TestLoadConfig extends App{

  val conf = ConfigFactory.load("application.stg.conf")
  println(conf.getString("default.user"))
  println(conf.getString("default.env"))

  val confFromConfig = AppConfig.main
  //println(s"*** confFromConfig : $confFromConfig")
  println(confFromConfig.getString("default.user"))
  println(confFromConfig.getString("default.env"))

  val app_config_class = new AppConfigClass
  app_config_class.env = "prod"
  val confFromConfigClass = app_config_class.GetEnvConfig("prod")
  println(confFromConfigClass.getString("default.user"))
  println(confFromConfigClass.getString("default.env"))




}

package common

import com.typesafe.config.{Config, ConfigFactory}

class AppConfigClass {

  var env = ""

  def GetEnv(env:String): String = env match{
    // TODO : fix parse env loading different conf file
    case "prod" => "application.prod.conf"
    case "stg" => "application.stg.conf"
    case _ => "application.dev.conf"
    //case _ => "application.stg.conf"
  }

  def GetEnvConfig(env:String): Config = {
    val envConfig = GetEnv(env)
    val conf = ConfigFactory.load(envConfig)
    conf
  }

}

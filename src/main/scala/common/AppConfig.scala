package common

import com.typesafe.config.{Config, ConfigFactory}

object AppConfig {

  def GetEnv(env:String): String = env match{
   // TODO : fix parse env loading different conf file
   case "prod" => "application.prod.conf"
   case "stg" => "application.stg.conf"
   case _ => "application.dev.conf"
   //case _ => "application.stg.conf"
  }

  private val cfg = ConfigFactory.load()

  var env: String = GetEnv(cfg.toString)

  val main = ConfigFactory.load(GetEnv(env))
}

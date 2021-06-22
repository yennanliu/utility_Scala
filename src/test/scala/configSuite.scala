import org.scalatest._
import org.scalatest.matchers.should
import org.scalatest.prop.TableDrivenPropertyChecks

import LoadConfigsFromEnv.defaultConfig

import com.typesafe.config.{Config, ConfigFactory}

class configSuite extends propspec.AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {

  val cfg = ConfigFactory.load("application.conf")
  val default_cfg = defaultConfig.load(cfg)

  val user = default_cfg.user
  val env = default_cfg.env

  assert(user == "devUser")
  assert(env == "dev")
}

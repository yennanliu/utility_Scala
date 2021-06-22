package LoadConfigsFromEnv

import com.typesafe.config.Config

case class defaultConfig(
     user: String,
     env: String
                        )

object defaultConfig {
  def load(config: Config): defaultConfig = {
    defaultConfig(
      user = config.getString("default.user"),
      env = config.getString("default.env")
    )
  }

}

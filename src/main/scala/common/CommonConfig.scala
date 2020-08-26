package common

import com.typesafe.config.{Config, ConfigFactory}

object CommonConfig{

    private val cfg = ConfigFactory.load()

    val env: String = if (cfg.hasPath("env")) cfg.getString("env") else "default"

    val config: Config = cfg
        .getConfig(env)
        .withFallback(cfg.getConfig("default"))

    val user: String = config.getString("user")

    val directory: String = config.getString("directory")

    val dbname: String = config.getString("db.dbname")

    val dbschema: String = config.getString("db.dbschema")

}
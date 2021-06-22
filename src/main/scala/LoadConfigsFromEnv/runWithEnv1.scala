package LoadConfigsFromEnv

/**
 *  Example command :
 *
 *  sbt assembly
 *
 *  export env=prod
 *
 *  java -jar \
 *  --class LoadConfigsFromEnv.runWithEnv1  \
 *  -Dconfig.resource="application.${env}.conf" \
 *  ./target/target/scala-2.11/utilityscala_2.11-1.0.jar
 *
 *
 */

import com.typesafe.config.ConfigFactory

import LoadConfigsFromEnv.defaultConfig

object runWithEnv1 extends App {

  println("runWithEnv1 start ...")

  val cfg = ConfigFactory.load("application.conf")
  val default_cfg = defaultConfig.load(cfg)

  println("default_cfg = " + default_cfg.toString)

  val user = default_cfg.user
  val env = default_cfg.env

  println(s"user = $user")
  println(s"env = $env")

  println("runWithEnv1 end ...")
}

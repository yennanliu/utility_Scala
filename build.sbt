name := "Simple Project"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"

resolvers += "Local Maven Repository" at "http://download.java.net/maven/2/"
resolvers += Resolver.bintrayIvyRepo("com.eed3si9n", "sbt-plugins")
resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

//addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.3")

//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0" 
libraryDependencies ++= Seq(
	//"org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % "test",
	"org.scalactic" %% "scalactic" % "3.0.8",
	"org.scalatest" %% "scalatest" % "3.0.8" % "test",
    "org.apache.spark" %% "spark-sql" % "2.3.0",
    "org.apache.spark" %% "spark-mllib" % "2.2.0"
         )

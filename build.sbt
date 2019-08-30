name := "Simple Project"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"

//resolvers += "Local Maven Repository" at "file://"+Path.yennanliu+"/.m2/repository"

//resolvers += "Spark Packages Repo" at "https://dl.bintray.com/spark-packages/maven"

resolvers += "Local Maven Repository" at "http://download.java.net/maven/2/"


libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-sql" % "2.3.0"
)


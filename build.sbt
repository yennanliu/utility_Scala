name := "Simple Project"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"

resolvers += "Local Maven Repository" at "http://download.java.net/maven/2/"

//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0" 
libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-sql" % "2.3.0",
    "org.apache.spark" %% "spark-mllib" % "2.2.0"
)


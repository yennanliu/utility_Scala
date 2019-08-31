name := "Simple Project"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"

//resolvers += "Local Maven Repository" at "file://"+Path.yennanliu+"/.m2/repository"

//resolvers  += "MavenRepository" at "http://central.maven.org/maven2"

resolvers += "Local Maven Repository" at "http://download.java.net/maven/2/"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0"


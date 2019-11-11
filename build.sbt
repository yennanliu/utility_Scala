  
name := "Utility-Scala"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"

libraryDependencies ++= Seq(
  // config
  "com.typesafe" % "config" % "1.2.1", 
  // spark  
  "org.apache.spark" %% "spark-core" % "2.3.0",
  "org.scalactic" %% "scalactic" % "3.0.8",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.apache.spark" %% "spark-sql" % "2.3.0",
  "org.apache.spark" %% "spark-mllib" % "2.2.0",
  // spark stream 
  "org.apache.spark" %% "spark-streaming" % "2.3.1",
  "org.apache.spark" % "spark-sql-kafka-0-10_2.11" % "2.2.1",
  "org.apache.spark" % "spark-streaming-kafka-0-8_2.11" % "2.2.1",
  "org.apache.spark" %% "spark-streaming-kinesis-asl" % "2.2.1",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.3.1",
  "com.github.catalystcode" %% "streaming-reddit" % "0.0.1",
  "org.apache.spark" %% "spark-hive" % "2.3.0" % "provided",
  "mysql" % "mysql-connector-java" % "8.0.17"


)

conflictManager := ConflictManager.latestRevision

//mainClass := Some("rdd.WordCount")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
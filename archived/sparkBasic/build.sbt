name := "UtilityScala"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"

libraryDependencies ++= Seq(
  // config
  "com.typesafe" % "config" % "1.2.1", 
  // TODO : need to fix spark verison when set scala == 2.13.0
  // spark  
  "org.apache.spark" %% "spark-core" % "2.3.0",
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
  "mysql" % "mysql-connector-java" % "8.0.17",

  // click (DB library)
  "com.typesafe.slick" %% "slick" % "3.0.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",

  // sqlite jdbc
  "org.xerial" % "sqlite-jdbc" % "3.7.2",

  // scalatest
  "org.scalactic" %% "scalactic" % "3.2.0",
  "org.scalatest" %% "scalatest" % "3.2.0" % "test",
  "org.scalatest" %% "scalatest-funsuite" % "3.2.0" % "test",
  "org.scalatest" %% "scalatest-propspec" % "3.2.0" % "test",
  "org.scalatest" %% "scalatest-featurespec" % "3.2.0" % "test"
)

conflictManager := ConflictManager.latestRevision

//mainClass := Some("rdd.WordCount")

// assemblyMergeStrategy in assembly := {
//   case PathList("META-INF", xs @ _*) => MergeStrategy.discard
//   case x => MergeStrategy.first
// }
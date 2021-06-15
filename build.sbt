
name := "UtilityScala"
version := "1.0"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  // config
  "com.typesafe" % "config" % "1.2.1", 
  // TODO : need to fix spark verison when set scala == 2.13.0
  // time
  "joda-time" % "joda-time" % "2.9.9",
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
  "org.scalatest" %% "scalatest-featurespec" % "3.2.0" % "test",
  // apache
  "org.apache.commons" % "commons-lang3" % "3.4",
  "org.apache.httpcomponents" % "httpclient" % "4.5.2",
  // google
  "com.google.code.gson" % "gson" % "2.8.5",
  // Akka
  "com.typesafe.akka" %% "akka-actor" % "2.5.28"
)

conflictManager := ConflictManager.latestRevision

//mainClass := Some("rdd.WordCount")

// assemblyMergeStrategy in assembly := {
//   case PathList("META-INF", xs @ _*) => MergeStrategy.discard
//   case x => MergeStrategy.first
// }
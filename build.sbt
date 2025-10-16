name := "scala-demo"
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.17"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.30"
libraryDependencies ++= Seq(
  "org.flywaydb" %% "flyway-play" % "9.1.0"
)
// Add Flyway's MySQL database support (required since Flyway 9)
libraryDependencies += "org.flywaydb" % "flyway-mysql" % "9.1.0"

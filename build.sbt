ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val circeVersion = "0.13.0"

lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-2906",
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-core" % circeVersion,
      "io.circe" %% "circe-parser" % circeVersion
    )
  )

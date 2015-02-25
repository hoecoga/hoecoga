import sbt.Keys._
import sbt._

object Build extends sbt.Build {
  import Settings._

  lazy val root = Project(id = "hoecoga", base = file("."), settings = defaultSettings)
}

object Settings {
  val defaultSettings = Seq(
    scalaVersion := "2.11.5",
    scalacOptions in (Compile, compile) ++= Seq("-Xlint", "-Xfatal-warnings", "-feature", "-unchecked", "-deprecation"))
}

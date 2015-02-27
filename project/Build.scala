import sbt.Keys._
import sbt._

object Build extends sbt.Build {
  import Settings._

  lazy val root = Project(id = "hoecoga", base = file("."), settings = defaultSettings).aggregate(edge)

  private[this] def subProject(id: String) = Project(id = id, base = file(s"modules/$id"), settings = defaultSettings)

  lazy val edge = subProject("edge").enablePlugins(play.PlayScala).settings(testSettings: _*)
}

object Settings {
  val defaultSettings = Seq(
    scalaVersion := "2.11.5",
    scalacOptions in (Compile, compile) ++= Seq("-Xlint", "-Xfatal-warnings", "-feature", "-unchecked", "-deprecation"))

  val testSettings = Seq(libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test")
}

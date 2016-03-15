import com.sentrana.sbt.common.Dependencies._

name := "FoodBuy"

git.baseVersion := "3.3.2"

libraryDependencies ++= Seq(
  apacheHttpClient,
  apacheHttpMime,
  casbah,
  commonsIo,
  jdbc,
  json4sExt,
  json4sMongo,
  json4sNative,
  nscalaTime,
  postgresql,
  prefuse,
  scalaReflect.value,
  scalaTestPlusPlay,
  twitterUtilCore,
  ws
)

lazy val biq = project.in(file("."))
  .enablePlugins(play.PlayScala)
  .enablePlugins(SbtWeb)
  .aggregate(appshell)
  .dependsOn(appshell % "test->test;compile->compile")

lazy val appshell = project.in(file("app-shell"))
  .enablePlugins(play.PlayScala)

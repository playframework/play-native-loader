playBuildRepoName in ThisBuild := "play-native-loader"

lazy val `play-native-loader` = project
  .in(file("."))
  .enablePlugins(PlayLibrary)
  .settings(
    name := "play-native-loader",
    scalaVersion := "2.12.1",
    crossScalaVersions := Seq("2.11.8", "2.12.1"),
    releaseCrossBuild := true
  )
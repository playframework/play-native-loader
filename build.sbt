name := "play-native-loader"

organization := "com.typesafe.play"

version := "1.0"

scalaVersion := "2.12.1"

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1")

autoAPIMappings := true

playBuildRepoName in ThisBuild := "play-native-loader"

lazy val PomExtra = {
  <scm>
    <url>https://github.com/playframework/play-native-loader</url>
    <connection>scm:git:git@github.com:playframework/play-native-loader.git</connection>
    <developerConnection>
      scm:git:git@github.com:playframework/play-native-loader.git
    </developerConnection>
  </scm>
  <developers>
    <developer>
      <id>play-team</id>
      <name>Play Team</name>
    </developer>
  </developers>
}

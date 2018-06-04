name := "get-programming-with-scala-lesson25"

version := "0.1"

scalaVersion := "2.12.6"

val Http4sVersion = "0.18.8"
val LogbackVersion = "1.2.3"

libraryDependencies ++= Seq(
  "org.http4s"      %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
  "org.http4s"      %% "http4s-circe"          % Http4sVersion,
  "io.circe" %% "circe-generic" % "0.9.3",
  "io.circe" %% "circe-literal" % "0.9.3",
  "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
)

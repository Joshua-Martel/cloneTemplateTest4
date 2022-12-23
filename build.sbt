
import Dependencies.{compiledDependencies,testDependencies}
import Dependencies.Libraries._
import Dependencies.TestDependencies._

name := "cloneTemplateTest4"
version := "1.0"

scalaVersion := "2.13"

libraryDependencies ++= compiledDependencies(
  logbackClassic,
  pureConfig,
  akkaSlf4j,
  jwtCirce
) ++ testDependencies(
  akkaTestkit,
  scalatest
)

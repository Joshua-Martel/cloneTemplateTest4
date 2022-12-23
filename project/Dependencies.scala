
import sbt._

object Dependencies {

  def compiledDependencies(deps: ModuleID*): Seq[ModuleID] = deps.map(_ % Compile)

  def testDependencies(deps: ModuleID*): Seq[ModuleID] = deps.map(_ % Test)

  object Libraries {
    val logbackClassic = "ch.qos.logback" % "logback-classic" % "1.2.3"
    val pureConfig = "com.github.pureconfig" %% "pureconfig" % "0.17.1"
    val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % "1.2.3"
    val jwtCirce = "com.github.jwt-scala" %% "jwt-circe" % "9.0.1"
  }

  object TestDependencies {
    val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % "2.5.22"
    val scalatest = "org.scalatest" %% "scalatest" % "3.0.7"
  }
}

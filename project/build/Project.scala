import sbt._
class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) {
  val liftVersion = "2.4"
  val webkit = "net.liftweb" %% "lift-webkit" %
    liftVersion % "compile->default"
  val logback = "ch.qos.logback" % "logback-classic" %
    "0.9.26" % "compile->default"
  val servlet = "javax.servlet" % "servlet-api" %
    "2.5" % "provided->default"
  val jetty6 = "org.mortbay.jetty" % "jetty" %
    "6.1.22" % "test->default"
  val junit = "junit" % "junit" %
    "4.5" % "test->default"
  val specs = "org.scala-tools.testing" %% "specs" %
    "1.6.6" % "test->default"
  val mapper = "net.liftweb" %% "lift-mapper" % liftVersion
}
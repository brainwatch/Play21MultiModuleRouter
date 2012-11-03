import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "routerb"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
       // Add your project dependencies here,
       javaCore,
       javaJdbc,
       javaEbean,
       "routerc" % "routerc_2.10" % "1.0-SNAPSHOT",
       "japid42" % "japid42_2.10" % "0.5.2"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      // Add your own project settings here      
    )

}

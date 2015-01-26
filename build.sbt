//import ScalaJSKeys._

//scalaJSSettings
enablePlugins(ScalaJSPlugin)

name := """learn-scala-js"""

version := "1.0"

scalaVersion := "2.11.5"

skip in packageJSDependencies := false

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.6" % "test"

//libraryDependencies += "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.7.0"

// Minimal usage
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "0.7.2-RC1"

// React itself
//   (react-with-addons.js can be react.js, react.min.js, react-with-addons.min.js)
jsDependencies += "org.webjars" % "react" % "0.12.1" / "react-with-addons.js" commonJSName "React"

// Test support including ReactTestUtils
//   (requires react-with-addons.js instead of just react.js)
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "test" % "0.7.2-RC1" % "test"

// Scalaz support
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "ext-scalaz71" % "0.7.2-RC1"

// Monocle support
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "ext-monocle" % "0.7.2-RC1"

// Extra features
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "extra" % "0.7.2-RC1"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.3"


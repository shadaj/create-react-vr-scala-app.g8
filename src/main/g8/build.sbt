enablePlugins(ScalaJSPlugin)

name := "$name$"

scalaVersion := "2.12.4"

libraryDependencies += "me.shadaj" %%% "slinky-vr" % "0.3.2+3-6a743e66+20180318-1804"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.3.2+3-6a743e66+20180318-1804"

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full)

scalaJSModuleKind := ModuleKind.CommonJSModule

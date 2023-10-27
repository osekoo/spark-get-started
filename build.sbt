organization := sys.env.get("APP_ORGANIZATION").getOrElse("org.company.dev")

name := sys.env.get("APP_NAME").getOrElse("spark-get-started") // the project's name

version := sys.env.get("APP_VERSION").getOrElse("1.0-SNAPSHOT") // the application version

scalaVersion := sys.env.get("SCALA_VERSION").getOrElse("2.12.18") // version of Scala we want to use (this should be in line with the version of Spark framework)

crossTarget := baseDirectory.value / "target"

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  "spark-get-started-1.0-SNAPSHOT.jar"
}

val sparkVersion = sys.env.get("SPARK_VERSION").getOrElse("3.5.0")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided"
)

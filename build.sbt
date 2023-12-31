
name := "sentiment-analyzer"
description := "A demo application to showcase sentiment analysis using Stanford CoreNLP and Scala"
version  := "0.1.0"

scalaVersion := "2.11.8"

libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.5.2" artifacts (Artifact("stanford-corenlp", "models"), Artifact("stanford-corenlp"))
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3" % Runtime

import java.io.FileNotFoundException

import scala.io.Source
import scala.util.control.NonFatal

name := "get-programming-with-scala-lesson16"

version := "0.1"

scalaVersion := "2.12.6"


try {
  println("Executing try block")
} finally {
  println("Executing finally block")
}


NonFatal

Throwable

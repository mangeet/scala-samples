package com.mse.samples

import scala.io.Source
import java.io.File

/**
 * @author mangeeteden
 */
class FileProcessor {

  def getFile = {

    val userHome = System.getProperty("user.home")
    val lines = Source.fromFile(s"$userHome/MANIFEST.MF").getLines().toList

    for (
      line <- lines
      //if line.startsWith("Built-By")
    ) {
      Console println line
    }

    Console println "done!!"
  }
}
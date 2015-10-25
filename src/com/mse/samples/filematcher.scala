package com.mse.samples

import scala.io.Source
import java.io.File

/**
 * @author mangeeteden
 */

object filematcher {
   def main(args: Array[String]): Unit = {
     
     val filematcher = new filematcher
     val files = filematcher.fileEndsWith(_.endsWith("src"))
     print(files)
   }
}

class filematcher {
  
  def fileEndsWith(matcher: (String) => Boolean) = {
    
    val files = new java.io.File(".").listFiles()
    for(file <- files; if matcher(file.getName)) yield file
  }
}
package com.mse.samples

/**
 * @author mangeeteden
 */
object matchtoken {

  def main(args: Array[String]): Unit = {
    if (!args.isEmpty) args(0) match {
      case "Hello" => print("Yes")
      case "Bye"   => print("Ok")
      case _       => print("Pass value and look magic !!")
    }
  }
}
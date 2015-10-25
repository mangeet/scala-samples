package com.mse.samples.traits

import scala.collection.mutable.ArrayBuffer

/**
 * @author mangeeteden
 */

abstract class Queue {

  def get: Int
  def put(num: Int)
}

class IntQueue extends Queue {

  val buffer = new ArrayBuffer[Int]

  override def get = {
    if (buffer.length > 0)
      buffer.remove(0)
    else -1
  }

  override def put(num: Int):Unit = {
     buffer += num
  }
}

object test {
  
  def main(args: Array[String]): Unit = {
    
    val queue = new IntQueue with Double with Increment
    
    println(queue.get)
    queue put 1
    queue put 2
    
    println(queue.get)
  }
}

trait Double extends Queue {

  abstract override def put(num: Int) {super.put(2*num)}
}

trait Increment extends Queue {

  abstract override def put(num: Int) {super.put(1+num)}
}

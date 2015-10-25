package com.mse.samples.hierarchy

/**
 * @author mangeeteden
 */
abstract class Fruit(val category: String = "Fruit") extends Eatery

class Banana(override val name: String = "Banana", override val unit: String = "dozen") extends Fruit

object Food {
  def main(args: Array[String]): Unit = {
    val eatery = new Banana
    println(eatery)
  }
}
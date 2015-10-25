package com.mse.samples.hierarchy

import scala.actors.Actor


/**
 * @author mangeeteden
 */
abstract class Eatery {

  def name: String
  def category: String
  def unit: String

  override def toString = {
    s"Name: $name, Category: $category, Unit: $unit, description: $description"
  }

  def description = {

    this.category match {

      case "Fruit" => "Fruits are delicious in taste and good for health"
      case _ => "Undefined category"
    }
  }
}

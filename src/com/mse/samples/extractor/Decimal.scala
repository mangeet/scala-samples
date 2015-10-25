package com.mse.samples.extractor

/**
 * @author mangeeteden
 */
object Decimal {

  def unapplySeq(s: String): Option[Seq[String]] = {

    val regex = """(-)?(\d+)(\.\d*)?""".r
    Some((regex findAllIn s).toList)
  }

  def main(args: Array[String]): Unit = {

    val s = "-13.24"

    s match {
      case Decimal(sym, intVal, fracVal) => println(s"Symbol: $sym, Integer part: $intVal, Fraction Value: $fracVal")
    }
  }
}
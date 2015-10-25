package com.mse.samples.currency

/**
 * @author mangeeteden
 */
sealed abstract class Currency {

  // Currency(100, "USD") + Currency(150, USD) = 

  val amount: Float
  val code: String

  def +(that: Currency): Currency

  override def toString = {
    amount + " " + code
  }
}

object  CurrencyConverter {
  
  def convert(currency: Currency): Currency = currency match {
    
    case USD(amount) => USD(amount)
    case EUR(amount) => USD(amount * 1.12F)
    case _ => USD(1.0F)
  }
}

class CurrencyCalc(val amount: Float) extends Currency {
  
  override val code: String = "USD"
  
  def +(that: Currency): Currency = {
    val thisCur = CurrencyConverter.convert(this)
    val thatCur = CurrencyConverter.convert(that)
    new CurrencyCalc(thisCur.amount + thatCur.amount)
  }
}

case class USD(override val amount: Float) extends CurrencyCalc(amount) {

  override val code: String = "USD"
  
}

case class EUR(override val amount: Float) extends CurrencyCalc(amount) {

  override val code: String = "EUR"
}

object Currency {
  
  def main(args: Array[String]): Unit = {
    val currency: Currency = USD(100) + USD(150)
    println(currency)
    
    val mixedcurrency: Currency = EUR(100) + USD(100)
    println(mixedcurrency)
  }
}
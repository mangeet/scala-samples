package com.mse.samples.extractor

/**
 * @author mangeeteden
 */
object Email {
  
  def apply(user: String, domain: String) = {
    
    s"$user@$domain"
  }
  
  def unapply(s: String): Option[(String, String)] = {
    if(s contains "@"){ val tokens = s split "@";Some(tokens(0), tokens(1))} else None
  }
  
  def main(args: Array[String]): Unit = {
   val email = "amaneden16@gmail.com"
   
   email match {
     case Email(user, domain) => println("Valid: " + s"$user@$domain")
     case _ => println("Not a valid email-id")
   }
  }
  
}
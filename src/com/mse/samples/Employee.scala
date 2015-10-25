package com.mse.samples

/**
 * @author mangeeteden
 */
class Employee(id: Int, name: String, salary: Float) {
  
  require(name != null)
  
  val empId = id
  val empName = name
  val empSalary = salary
  
  def this(id: Int, name: String) = this(id, name, 0.00F)
  
  def calculateSalary: Float = {
    0.00F
  }
  
  override def toString = {
    s"Id:$empId Name: $empName Salary: $empSalary"
  }
}
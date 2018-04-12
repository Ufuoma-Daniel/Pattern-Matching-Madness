package services

import connectors.MathsConnector
import exceptions.ThatsNegativeException

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object MathsService {

  def addTwoNumbers(a: Int, b: Int): Future[Int] = ???

  def subtractTwoNumbers(a: Int, b: Int): Future[Int] = ???

  def subtractToString(a: Int, b: Int): Future[String] = ???

  def addIfResultIsEven(a: Int, b: Int): Future[Int] = ???

  def addThenSubtract(startingNumber: Int, numToAdd: Int, numToSubtract: Int): Future[Int] = ???

  def subtractErrorIfNegative(a: Int, b: Int): Future[Int] = ???

  def subtractBut1000ifNegative(a: Int, b: Int): Future[Int] = ???

  def divide0IfError(a: Int, b: Int): Future[Int] = ???

  def divideAndThenSubtractWithErrorDefaults(startingNumber: Int, numToDivideBy: Int, numToSubtract: Int): Future[Int] = ???

}

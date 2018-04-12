package connectors

import exceptions.ThatsNegativeException

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object MathsConnector {

  def add(x: Int, y: Int): Future[Int] = {
    Future.successful(x + y)
  }

  def subtract(x: Int, y: Int): Future[Int] = {
    Future.successful(x - y)
  }

  def divide(x: Int, y: Int): Future[Int] = {
    Future(x / y)
  }

  def subtractErrorIfNegative(x: Int, y: Int): Future[Int] = {
    if(x - y >= 0) {
      Future.successful(x - y)
    } else {
      Future.failed(new ThatsNegativeException("Negative Value"))
    }
  }

}

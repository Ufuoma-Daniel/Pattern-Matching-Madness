package connectors

import scala.concurrent.Future

object MathsConnector {

  def add(a: Int, b: Int): Future[Int] = {
    Future.successful(a + b)
  }

}

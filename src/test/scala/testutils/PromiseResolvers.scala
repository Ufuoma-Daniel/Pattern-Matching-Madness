package testutils

import scala.concurrent.{Await, Future}

trait PromiseResolvers {

  import scala.concurrent.duration._

  protected implicit val defaultTimeout: FiniteDuration = 10 seconds

  def await[T](future: Future[T])(implicit timeout: Duration): T = Await.result(future, timeout)

}

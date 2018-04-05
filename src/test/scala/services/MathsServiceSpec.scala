package services

import org.scalatest.{Matchers, WordSpec}
import testutils.PromiseResolvers

class MathsServiceSpec extends WordSpec with Matchers with PromiseResolvers {

  "addTwoNumbers" should {
    "add 3 and 4" in {
      await(MathsService.addTwoNumbers(3, 4)) shouldBe 7
    }
    "add 0 and 300" in {
      await(MathsService.addTwoNumbers(0, 300)) shouldBe 300
    }
    "add -12 and -29" in {
      await(MathsService.addTwoNumbers(-12, -29)) shouldBe -41
    }
  }

}

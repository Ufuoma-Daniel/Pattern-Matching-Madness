package services

import models._
import org.scalatest.{Matchers, WordSpec}

class MatchingServiceSpec extends WordSpec with Matchers{

  /*
  "matchIntUnder10" should{
    "double the number it receives [5]" in{
      MatchingService.matchIntUnder10(5) shouldBe 10
    }

    "double the number it receives [9]" in{
      MatchingService.matchIntUnder10(9) shouldBe 18
    }

    "double the number it receives [49920]" in{
      MatchingService.matchIntUnder10(49920) shouldBe 0
    }

    "double the number it receives [-10]" in{
      MatchingService.matchIntUnder10(-10) shouldBe 0
    }
  }

  "matchIntToString" should{
    "convert a int to String [5]" in{
      MatchingService.matchIntToString(5) shouldBe "five"
    }

    "convert a int to String [0]" in{
      MatchingService.matchIntToString(0) shouldBe "zero"
    }

    "convert a int to String [-10]" in{
      MatchingService.matchIntToString(-10) shouldBe "below zero"
    }

    "convert a int to String [110]" in{
      MatchingService.matchIntToString(110) shouldBe "above ten"
    }
  }

  "matchWithGuards" should{
    "half even numbers" in{
      MatchingService.matchWithGuards(24) shouldBe 12
    }

    "double odd numbers" in{
      MatchingService.matchWithGuards(11) shouldBe 22
    }

    "display 0 if a multiple of five" in{
      MatchingService.matchWithGuards(15) shouldBe 0
    }

    "do nothing to negatives"in{
      MatchingService.matchWithGuards(-12) shouldBe -12
    }
  }


  "matchOnType" should{
    "turn odd numbers into strings" in{
      MatchingService.matchOnType(3) shouldBe "three"
    }

    "double even numbers" in{
      MatchingService.matchOnType(8) shouldBe 16
    }

    "turn strings into halfed integers" in{
      MatchingService.matchOnType("22") shouldBe 11
      MatchingService.matchOnType("7") shouldBe 4
    }

    "say hello and goodbye" in{
      MatchingService.matchOnType("hello") shouldBe "goodbye"
      MatchingService.matchOnType("goodbye") shouldBe "hello"
    }

    "deal with the extra" in{
      //MatchingService.matchOnType(BigDecimal(2212341234567823456))
    }
  }

  "matchCaseClassesGarage" should{
    "fix broken cars" in{
      MatchingService.matchCaseClassesGarage( Car("Broken", 4, Red) ) shouldBe Car("Fixed", 4, Red)
    }

    "Recolour primary coloured cars" in{
      MatchingService.matchCaseClassesGarage( Car("Normal", 4, Red) ) shouldBe Car("Normal", 4, Yellow)
      MatchingService.matchCaseClassesGarage( Car("Normal", 4, Yellow) ) shouldBe Car("Normal", 4, Green)
      MatchingService.matchCaseClassesGarage( Car("Normal", 4, Green) ) shouldBe Car("Normal", 4, Red)
    }

    "Add wheels" in{
      MatchingService.matchCaseClassesGarage( Car("Normal", 1, Red) ) shouldBe Car("Normal", 4, Red)
    }
  }


  //From this point on, I am just making some funky stuff, enter if you dare...
  //Basically, I'm not sure what I'm doing anymore so best of luck!

  "matchWithRegex" should{
    "remove all vowels" in{
      MatchingService.matchWithRegex("Welsh", ???) shouldBe "Wlsh"
      MatchingService.matchWithRegex("Octopus", ???) shouldBe "ctps"
      MatchingService.matchWithRegex("Animal", ???) shouldBe "nml"
    }

    "remove every 3rd char" in{
      MatchingService.matchWithRegex("Hat", ???) shouldBe "Ha"
      MatchingService.matchWithRegex("Conglomorate", ???) shouldBe "Coglmoat"
      MatchingService.matchWithRegex("123456789", ???) shouldBe "124578"
    }

    "Double numbers, Capitalize letters, Shrink capitals" in{
      MatchingService.matchWithRegex("P4ssw0rd", ???) shouldBe "p8SSW0RD"
      MatchingService.matchWithRegex("Pr1nC3s5", ???) shouldBe "pR2Nc6S10"
    }
  }


  "rainbowWheelMatch" should{
    "return a list of letters" in{
      //to create this match you must know that
      // the colour red flips the order of the previous colours
      // and green must never appear before blue unless they'll mix into cyan
      //Br = brown, Bl = blue

      "level one" in{
        MatchingService.rainbowWheelMatch(Seq(White, Blue, Yellow)) shouldBe "W, Bl, Y"
      }

      "level two" in{
        MatchingService.rainbowWheelMatch(Seq(Brown, Yellow, Red, Pink)) shouldBe "Y, Br, R, P"
      }

      "level three" in{
        MatchingService.rainbowWheelMatch(Seq(Blue, Green, Blue, Green, Blue)) shouldBe "Bl, C, C"
      }

      "level four" in{
        MatchingService.rainbowWheelMatch(Seq(Brown, Yellow, Red, Purple, Green, Blue)) shouldBe "Y, Br, R, P, C"
      }
    }
  }

  "rainbowWheelMixNMatch" should{
    "return a list of letters" in{
      //All primary colours will become secondary colours if placed to one another - Red + yellow = orange
      // The colour white will break down any seq beside it to its original parts, [Orange, White, Blue] = [Yellow, Red, Blue]
      // When split, the brighter colour comes first. White will not split a colour only if there is a Red beside it,
      // in which case, they will merge to make Pink.

      "oh dear" in{
        MatchingService.rainbowWheelMixNMatch(Seq(Red, Blue, Red, Yellow)) shouldBe
          Seq(Purple, Orange)
      }

      "down the rabbit hole" in{
        MatchingService.rainbowWheelMixNMatch(Seq(Green, White, Pink, Blue, Red, Yellow, Orange)) shouldBe
          Seq(Green, White, Purple, Orange, Orange)
      }

      "we go" in{
        MatchingService.rainbowWheelMixNMatch(Seq(Pink, White, Pink, White, Pink, White, Red)) shouldBe
          Seq(White, Red, White, Pink, White, Red, Red)
      }
    }
  }
  */
}

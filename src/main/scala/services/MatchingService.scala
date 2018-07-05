package services

import models.{Car, Colour}

object MatchingService {

  def matchIntUnder10(num : Int): Int = ???

  def matchStringToInt(string : String): String = ???

  def matchIntToString(num : Int): String = ???

  def matchOnType[A](value : A): A = ???

  def matchWithGuards[A](num : A): A = ???

  def matchCaseClassesGarage(car: Car): Car = ???

  def matchWithRegex(msg: String, regex: String): String = ???

  def rainbowWheelMatch(list : Seq[Colour]): String = ???

  def rainbowWheelMixNMatch(list: Seq[Colour]): Seq[Colour] = ???
}

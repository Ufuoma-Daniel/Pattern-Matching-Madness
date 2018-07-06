package services

import models.{Car, Colour}

object MatchingService {

  def matchIntUnder10(num : Int): Int = ???

  def matchIntToString(num : Int): String = ???

  def matchWithGuards(num : Int): Int = ???

  def matchOnType[A](value : A): Any = ???

  def matchCaseClassesGarage(car: Car): Car = ???

  def matchWithRegex(msg: String, regex: String): String = ???

  def rainbowWheelMatch(list : Seq[Colour]): String = ???

  def rainbowWheelMixNMatch(list: Seq[Colour]): Seq[Colour] = ???
}

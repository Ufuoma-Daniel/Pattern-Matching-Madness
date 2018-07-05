package models

case class Car (
               status: String,
               wheels: Int,
               colour: Colour
               )


sealed trait Colour
object Red extends Colour
object Yellow extends Colour
object Blue extends Colour
object Green extends Colour
object Orange extends Colour
object Purple extends Colour
object Brown extends Colour
object White extends Colour
object Pink extends Colour
object Cyan extends Colour

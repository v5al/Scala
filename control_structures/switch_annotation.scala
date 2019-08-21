package control_structures

import scala.annotation.switch

object switch_annotation {
  def main(args: Array[String]): Unit = {
    val i = 1
    val x = (i: @switch) match{
        case 1 => "One"
        case 2 => "Two"
        case _ => "Other"
    }
    println(x)
  }
}

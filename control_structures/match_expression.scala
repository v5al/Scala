package control_structures

object match_expression {
  def main(args: Array[String]): Unit = {
    var m=1
    var y=2001
    val month = m match {
      case 1 => "January"
      case 2 => "February"
      case 3 => "March"
      case 4 => "April"
      case 5 => "May"
      case 6 => "June"
      case 7 => "July"
      case 8 => "August"
      case 9 => "September"
      case 10 => "October"
      case 11 => "November"
      case 12 => "December"
      case _ => "Invalid month"
    }
    val year = y match {
        case 2000 | 2001 | 2002 => "Legendary"
        case _ => "Default"
    }
    println(s"Month: $month | Year: $y $year")
  }
}

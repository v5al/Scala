package control_structures

object map {
  def main(args: Array[String]): Unit = {
    val monthNumberToName = Map(
      1 -> "January",
      2 -> "February",
      3 -> "March",
      4 -> "April",
      5 -> "May",
      6 -> "June",
      7 -> "July",
      8 -> "August",
      9 -> "September",
      10 -> "October",
      11 -> "November",
      12 -> "December"
    )
    val monthName = monthNumberToName(5)
    println(monthName)
  }
}

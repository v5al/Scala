package function

object format_method {
  def main(args: Array[String]): Unit = {
    val KIT = "In %d and On %s"
    val years = 2019
    val mountain = "Kirirom"
    println(KIT.format(years,mountain))
  }
}

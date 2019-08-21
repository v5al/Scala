package option

object pattern_matching {
  def checkPattern(check: Option[String])= check match{
      case Some(s) => (s)
      case None => ("Not found !!")
  }

  def main(args: Array[String]): Unit = {
    val a = Map(1->"Hello",2->"World")
    println(checkPattern(a.get(5)))
  }
}

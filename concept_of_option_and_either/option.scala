package concept_of_option_and_either

object option {
  def main(args: Array[String]) {
    val students = Map("name a" -> "001", "name b" -> "002")

    println("show(students.get( \"name b\")) : " + show(students.get( "name b")) )
    println("show(students.get( \"name c\")) : " + show(students.get( "name c")) )
  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
}

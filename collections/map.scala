package collections

object map {
  def main(args: Array[String]): Unit = {
    var map = Map('A'->65,'B'->66, 'C' ->67)
    println(s"Value of A: ${map('A')}")
  }
}

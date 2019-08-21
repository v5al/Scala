package flatten_map_filter

object map {
  def main(args: Array[String]): Unit = {
    val names = List("Udam","Visal")
    val mapNames = names.map(_.toUpperCase)
    println(mapNames)
    val numbers = List(1,2,3,4,5)
    val mapNumbers = numbers.map(_*2) //or numbers.map(x=>x*2)
    println(mapNumbers)
  }
}

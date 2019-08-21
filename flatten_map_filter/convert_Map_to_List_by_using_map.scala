package flatten_map_filter

object convert_Map_to_List_by_using_map {
  val map1 = Map(1->"A",2->"B",3->"C")
  def main(args: Array[String]): Unit = {
    println(map1.map(x => "Hello" +x))
  }
}

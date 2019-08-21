package collections

object list_scan {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3)
    println(list1.scanLeft(2)(_-_))
    println(list1.scanRight(2)(_+_))
  }
}

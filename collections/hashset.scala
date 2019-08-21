package collections

object hashset {
  def main(args: Array[String]): Unit = {
    var s:Set[Int] = Set(1,3,5,7)
    //or
    var s1 = Set(2,4,6,8)
    //concat
    println(s ++ s1 + " or " + s.++(s1))
    //max and min
    println(s.min + s.max)
    //common value
    println(s.&(s1))
  }
}

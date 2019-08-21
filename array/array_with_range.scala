package array
import Array._

object array_with_range {
  def main(args: Array[String]): Unit = {
    var list1 = range(1,10,2) //from 1 till 9 and range difference 2
    var list2 = range(1,10) //from 1 till 9
    for(i<-list1) println(i)
    for(o<-list2) println(o)
  }
}

package array
import Array._

object concatenate_arrays {
  def main(args: Array[String]): Unit = {
    var x=Array(1,2,3,4,5)
    var y=Array(6,7,8,9)
    var z= concat(x,y)
    for(i <- z) println(i)
  }
}

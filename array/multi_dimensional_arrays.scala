package array
import Array._

object multi_dimensional_arrays {
  def main(args: Array[String]): Unit = {
    var x = ofDim[Int](3,3)
    x(0)(0) = 1
  }
}

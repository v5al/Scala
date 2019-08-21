package tasks
import scala.math.pow

object sum_of_cubes {
  def cubes(a:Int,b:Int,c:Int):Int={
    if(a<9 && b<9 && c==0) 0
    else a*a + b*b + cubes(a,b,c-1)
  }
  def main(args: Array[String]): Unit = {
    val x = scala.io.StdIn.readInt()
    val y = scala.io.StdIn.readInt()
    cubes(x,y,3)
  }
}

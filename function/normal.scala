package function

object normal {
  def main(args: Array[String]): Unit = {
    println("Answer is " + divInt(25,10) )
  }
  def divInt(x:Int,y:Int):Float = {
    return x/y
  }
}

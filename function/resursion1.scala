package function

object resursion1 {
  def sumInt(a:Int,b:Int):Int = if(a>b) 0 else a+sumInt(a+1,b)
  def main(args: Array[String]): Unit = {
    println(sumInt(4,5))
  }
}

package function

object anonymous_functions {
  def main(args: Array[String]): Unit = {
    var incre = (x:Int) => x+1  //or incre = (_:Int)+1
    println(incre(5))
    var mul = (x:Int,y:Int) => x+y //or mul = (_:Int) + (_:Int)
    println(mul(5,7))
  }
}

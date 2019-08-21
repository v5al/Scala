package function

object partially_applied_functions {
  def add(a:Int,b:Int) = {
    a+b
  }
  def sub(a:Int,b:Int)={
    a-b
  }
  def main(args: Array[String]): Unit = {
    var c = add(1,_)
    println(c(2))
    val d = sub _
    println(d(4,2))
  }
}

package function

object lambda_expressions {
  def main(args: Array[String]): Unit = {
    val add = (x:Int,y:Int) => x+y
    println(add(10,20))
  }
}

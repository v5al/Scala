package function

object functions_composition {
  val add=(a:Int)=> a+1
  val mul=(b:Int)=> b*2

  def main(args: Array[String]): Unit = {
    println((add compose mul)(2))
    println((add andThen mul)(2))
  }
}

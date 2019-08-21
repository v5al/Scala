package function

object closure {
  var a = 10
  val add=(x:Int)=>x+a
  def main(args: Array[String]): Unit = {
    a= 20
    val b = add(20)
    println(b)
  }
}

package string

object method {
  def main(args: Array[String]): Unit = {
    var str = "hello"
    println(str.drop(2)) //drop he
    println(str.take(2)) //take he
    println(str.capitalize) //HELLO
    "hello world".split(" ").foreach(println)
  }
}

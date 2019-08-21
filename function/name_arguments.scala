package function

object name_arguments {
  def main(args: Array[String]): Unit = {
    printInt(a=10,b=5)
  }
  def printInt(a: 10, b: 5) = {
    print(s"a:$a | b:$b")
  }
}

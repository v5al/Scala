package function

object recursion {
  def main(args: Array[String]): Unit = {
    print(factorial(4))
  }
  def factorial(n: Int):Int = {
    if(n<=1)  1
    else n*factorial(n-1)
  }
}

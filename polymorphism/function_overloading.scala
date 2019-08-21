package polymorphism

class calc {
  def add(a:Int,b:Int) = a+b
  def add(a:Int,b:Int,c:Int) = a+b+c
}

object function_overloading {
  def main(args: Array[String]): Unit = {
    val obj = new calc()
    println(obj.add(10,20))
    println(obj.add(10,20,30))
  }
}

package function

object high_order_function2 {
  def result(a:Int,b:Int,fun:Int=>Int,fun1:(Int,Int)=>Int,fun2:Int=>Int): Unit ={
    println(fun(a)+fun1(a,b)+fun2(b))
  }
  def first(a:Int):Int = {
    a*a
  }
  def second(a:Int,b:Int):Int = {
    2*a*b
  }
  def third(b:Int):Int = {
    b*b
  }
  def main(args: Array[String]): Unit = {
    result(2,3,first,second,third)
  }
}

package function

object high_order_function1 {
  def average(a:Double,b:Double,f:(Double,Double)=>Double): Unit ={
    println(f(a,b)/2)
  }
  def add(a:Double,b:Double): Double ={
    a+b
  }
  def min(a:Double,b:Double):Double ={
    a-b
  }
  def main(args: Array[String]): Unit = {
    average(33.0,30.0,add)
    average(22.0,20.0,min)
  }
}

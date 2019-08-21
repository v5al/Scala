package function

object high_order_function {
  def func(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double=f(f(x,y),z)
  def main(args:Array[String]): Unit ={
    val result = func(10,20,30,(x,y)=>x+y)
    val result1 = func(10,20,30,_+_)
    println(result)
    println(result1)
  }
}

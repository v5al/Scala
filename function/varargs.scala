package function

object varargs {
  def sum(a:Int,b:Int,args:Int*): Int ={
    var result = 0
    for(arg <- args){
      result +=arg
    }
    return result
  }
  def main(args: Array[String]): Unit = {
    println(sum(1,2,3,4,5,6,7,8,9,10))
  }
}

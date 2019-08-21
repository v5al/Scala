package exception_handling

object Either {
  def divide(a:Int,b:Int):Either[String,Int]={
    if(b==0) Left("Can't do a division!!")
    else Right(a/b)
  }

  def main(args: Array[String]): Unit = {
    var a = divide(10,0)
    a match {
        case Left(s) => println(s)
        case Right(n) => println(n)
    }
  }
}

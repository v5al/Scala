package exception_handling

object throww {
    def throwww(x:Int) ={
      if(x<0)
        throw new ArithmeticException("x<0")
      else
        println(s"x=$x")
    }

  def main(args: Array[String]): Unit = {
    throwww(-5)
  }
}

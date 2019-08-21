package exception_handling

object try_catch_finally {
  def main(args: Array[String]): Unit = {
    try{
      var divide = 5/0
    }catch{
        case i: IndexOutOfBoundsException => println("Index Out of Bound")
        case e: ArithmeticException => println("Arithmetic Exception")
    }finally {
      println("End of program ;)")
    }
  }
}

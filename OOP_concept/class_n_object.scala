package OOP_concept

class classs{
  def prin() {
    println("Hello World")
  }
}

object class_n_object {
  def main(args:Array[String]): Unit ={
    var obj = new classs()
    obj.prin()
  }
}

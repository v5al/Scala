package OOP_concept

abstract class parent[res]{
  def divide(a:res, b:res):res
}

class intDivide extends parent[Int]{
  def divide(a:Int,b:Int):Int = a/b
}

class doubleDivide extends parent[Double]{
  def divide(a:Double,b:Double):Double = a/b
}

object generic_classes {
  def main(args: Array[String]): Unit = {
    var obj = new intDivide().divide(1,2)
    var obj1 = new doubleDivide().divide(2.5,1.5)
    println(obj)
    println(obj1)
  }
}

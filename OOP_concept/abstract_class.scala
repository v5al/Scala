package OOP_concept

abstract class Parent{
  def showFamily()
}
class child extends Parent{
  def showFamily(): Unit ={
    println("There are 7 members.")
  }
}
object abstract_class {
  def main(args: Array[String]): Unit = {
    var obj = new child()
    obj.showFamily()
  }
}

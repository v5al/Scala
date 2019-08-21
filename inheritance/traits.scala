package inheritance

trait trait1{
  var a=1
}
trait trait2{
  var b=2
}
trait trait3{
  var c=3
}
class class1 extends trait1 with trait2 with trait3{
  def show: Unit ={
    println("a:" +a)
    println("b:" +b)
    println("c:" +c)
  }
}
object traits {
  def main(args: Array[String]): Unit ={
    val obj = new class1()
    obj.show
  }
}

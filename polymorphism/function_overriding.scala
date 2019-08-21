package polymorphism

class room {
  def student()={
    29
  }
}
class room1 extends room{
  override def student() = {
    30
  }
}
object function_overriding {
  def main(args: Array[String]): Unit = {
    var obj = new room1()
    println(obj.student())
  }
}

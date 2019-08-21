package polymorphism

class parent {
  def pri(no:Int,name:String): Unit ={
    println(s"no:$no | name:$name")
  }
  def pri(name:String,no:Int): Unit ={
    println(s"no:$no | name:$name :)")
  }
}

object function_overloading1 {
  def main(args: Array[String]): Unit = {
    val obj = new parent()
    obj.pri(10,"A")
    obj.pri(20,"B")
  }
}

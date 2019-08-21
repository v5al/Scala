package OOP_concept

class parent{
  val a =20
}

class child1 extends parent{
  override val a: Int = 30
  def prinn() = println(a)
}

object field_overriding {
  def main(args: Array[String]): Unit = {
    var obj = new child1()
    obj.prinn()
  }
}

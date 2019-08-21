package classs

class Person{
  var name= ""
}

object eq_methods {
  def main(args: Array[String]): Unit = {
    val p = new Person()
    p.name_$eq("Visal")     //Scala converts = into _$eq
    println(p.name)
  }
}

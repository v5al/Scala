package classs


case class person(name:String,age:Int)
object case_class {
  def main(args: Array[String]): Unit = {
    var person1 = person("A",19)
    println(person1.name + person1.age)
  }
}

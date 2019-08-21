package constructor


class Person(firstName:String,lastName:String){
  var age =0

  override def toString = s"$firstName $lastName is $age years old."
  def printFullName {println(this)}

  printFullName
}

object primary {
  def main(args: Array[String]): Unit = {
    val p = new Person("Udam","Visal")
  }
}

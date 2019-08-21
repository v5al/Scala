package constructor

class A(name:String,age:Int){
  var section = "A"
  def show(): Unit ={
    println(s"Name:$name | Age:$age | Section:$section")
  }
  def this(name:String,age:Int,section:String){
    this(name,age)
    this.section = section
  }
  def this(){
    this("ABC",18,"C")
  }
}
object constructor {
  def main(args:Array[String]): Unit ={
    val obj = new A("Visal",18).show()
    val obj1 = new A("TechUY",18,"B").show()
    val obj2 = new A().show()
  }
}


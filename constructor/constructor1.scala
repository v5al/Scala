package constructor

class Employee(empId: Int,name: String,salary :Double){
  //this is primary constructor
  println(empId,name,salary)
  //zero argument auxilary constructor
  def this()
  {
    //invokes argument in the constructor
    this(23,"name b",5000)
    println("auxiliary constructor")
  }
  //auxiliary constructor
  //e->empId,n->name in the constructor
  def this(e:Int,n:String){
    //invokes the particular arguement(empId,Name)
    this(e,n,5000)
  }
}
object axil2 {
  def main(args:Array[String]){
    val a1=new Employee(12,"name a",4000)
    val a3=new Employee()
    val a2=new Employee(24,"name c")
  }
}

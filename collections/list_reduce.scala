package collections

object list_reduce {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3)
    println(list1.reduceLeft((x,y)=>{println(s"$x,$y");x-y}))
    println(list1.reduceRight(_+_))
  }
}

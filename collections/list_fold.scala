package collections

object list_fold {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3)
    println(list1.foldLeft(2)((x,y)=>{println(s"$x,$y");x-y}))
    println(list1.foldRight(2)(_+_))
  }
}

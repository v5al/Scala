package tasks

object sum_of_odd {
  def math(arr:List[Int]):Int = arr.filter(_%2==1).sum
  def main(args: Array[String]): Unit = {
    val a:List[Int] = List(1,2,3,4,5,6,7,8,9,10)
    println(math(a))
  }
}

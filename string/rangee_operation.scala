package string

object rangee_operation {
  def main(args: Array[String]): Unit = {
    val range1 = 0 until 10 by 2
    for(i <- range1){
      println(i)
    }
    val range2 = range1.inclusive //copied from range1 and include 10
    for(i<-range2){
      println(i)
    }
  }
}

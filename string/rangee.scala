package string

object rangee {
  def main(args:Array[String]){
    val range1 = Range(0,11,2)  // range of 0 till 10 step 2
    for(i <- range1){
      println(i)
    }
  }
}

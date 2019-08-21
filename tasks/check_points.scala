package tasks

object check_points {
  def main(args: Array[String]): Unit = {
    val points = List(54,52,23,47,24,59).map(_*1.25)
    val newPoints = points.filter(x=>(x>44))
    println(newPoints)
    if(newPoints.length <= 3)
      println("Average")
    else if(newPoints.length == 4 )
      println("Good")
    else
      println("Excellent")
  }
}

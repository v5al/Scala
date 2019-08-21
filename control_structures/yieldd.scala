package control_structures

object yieldd {
  def main(args: Array[String])
  {
    var print = for( i <- 1 to 10 if i%2==0) yield i
    for(j<-print)
    {
      println(j)
    }
  }
}

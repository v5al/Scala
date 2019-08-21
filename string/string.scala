package string

object string {
  def main(args: Array[String]): Unit = {
    val s = "hello"
    println(s.length)
    //foreach
    s.foreach(println)
    for(c<-s) println(c)


  }
}

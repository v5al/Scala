package string

object string_builder {
  def main(args: Array[String]): Unit = {
    val x = new StringBuilder("Hello")
    //append character
    val charr = x+=' '
    //append string
    val str = x ++= "World"
    val str1 = x.append("!!")
    //clear
    //val str2 = x.clear()
    //delete char
    val str3 = x.delete(5,11)
    //insert string
    val str4 = x.insert(3,"lllllllllllll")
    println(str4)
  }
}

package inheritance

class point(val xx:Int, val yy:Int){
  var x:Int = xx
  var y:Int = yy
  def move(dx:Int,dy:Int): Unit ={
    x = x + dx
    y = y + dy
  }
}

class location(override val xx:Int,override val yy:Int, val zz:Int) extends point(xx, yy){
  var z:Int = zz
  def move(xx:Int,yy:Int,zz:Int): Unit ={
    x = x + xx
    y = y + yy
    z = z + zz
    println(s"x=$x | y=$y | z=$z")
  }
}
object extend {
  def main(args: Array[String]): Unit = {
    val obj = new location(10,20,30)
    obj.move(1,1,1)
  }
}

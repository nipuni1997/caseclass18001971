object distance {
  def main(args: Array[String]): Unit = {
    println("Enter x:")
    val a = readInt()
    println("Enter y:")
    val b = readInt()
    val p1 = Point(a, b)
    println("Enter x:")
    val c = readInt()
    println("Enter y:")
    val d = readInt()
    val p2=Point(c,d)
    val p3=p1.distance(p2)
    println(p3)
  }
  case class Point(a: Int, b: Int) {
    def x: Int = a

    def y: Int = b
    def distance(that:Point): Point = Point(Math.sqrt((this.x - that.x)* (this.x - that.x) + (this.y - that.y)* (this.y - that.y)))
  }

}

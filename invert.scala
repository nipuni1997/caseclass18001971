object invert {
  def main(args: Array[String]): Unit = {
    println("Enter x:")
    val a = readInt()
    println("Enter y:")
    val b = readInt()
    val p = Point(a, b)
    val p1 = p.invert1(p)
    println(p1)

  }

  case class Point(a: Int, b: Int) {
    def x: Int = a

    def y: Int = b

    def invert1(that: Point): Point = Point(this.y, this.x)

  }

}
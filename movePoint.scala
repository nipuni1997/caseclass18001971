object movePoint extends App{
  println("Enter 1st value of 1st point:")
  val a=readInt()
  println("Enter 2nd value of 1st point: ")
  val b=readInt()
  val p1=Point(a,b)

  val p3=p1.move(2,3)

  println(p3)
}
case class Point(a:Int, b:Int) {
  def x: Int = a
  def y: Int = b
  def move(dx:Int,dy:Int): Point =Point(this.x+dx,this.y+dy)
}
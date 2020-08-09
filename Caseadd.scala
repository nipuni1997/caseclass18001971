

object Caseadd extends App {
  println("Enter 1st value of 1st point:")
  val a=readInt()
  println("Enter 2nd value of 1st point: ")
  val b=readInt()
  val p1=Point(a,b)
  println("Enter 1st value of 2nd point:")
  val c=readInt()
  println("Enter 2nd value of 2nd point:")
  val d=readInt()
  val p2=Point(c,d)

  println(p1+p2)
}
case class Point(a:Int, b:Int){
def x:Int=a
  def y:Int=b
  def +(that:Point): Point =Point(this.x+that.x,this.y+that.y)
}

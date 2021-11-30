import scala.annotation.tailrec

object Factorial extends App{
  @tailrec
  def Fact(a:Int,b:Int):Int={
    if(a==0 || a==1)
      b
    else Fact(a-1,a*b)
  }
  println(Fact(a = 5,b = 1))

}

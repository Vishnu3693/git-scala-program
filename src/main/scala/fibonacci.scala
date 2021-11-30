import scala.annotation.tailrec

object fibonacci extends App{
  final def fab(n:Int):Int={
    @tailrec
    def fib(n:Int, start:Int, end:Int, index:Int):Int= {
      if (index == n) end
      else
        fib(n, end, start + end, index + 1)
    }
    fib(n,start=0,end=1,index=1)
  }
  println(fab(15))

}

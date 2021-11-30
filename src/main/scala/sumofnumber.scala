object sumofnumber extends App {
  def sum(start:Int):Int={
    def add(start:Int,last:Int,sum:Int):Int={
      if (start > last) sum
      else add(start+1 ,last , start+sum)
    }
    add(start,last=15,sum=0)

  }
  println(sum(start=10))
}

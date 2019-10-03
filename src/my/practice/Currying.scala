package my.practice

object Currying {

  def add(x:Int, y:String)(implicit a:Int, b:String) = (x+a,y+b)

  def main(args: Array[String]): Unit = {

    implicit val test1 = 40
    implicit val str = "Hello"
    println(add(10,"Hi"))

  }
}

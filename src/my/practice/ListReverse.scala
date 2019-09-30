package my.practice

import scala.collection.mutable.ListBuffer

object ListReverse {
  def main(args: Array[String]): Unit = {

    val l = List(1,3,4,7,2,10)
    println(l.reverse)

    var li : List[Int] = List()

    for(i <- 0 until l.size){
      li = l(i) :: li
    }

    println(li)
  }
}

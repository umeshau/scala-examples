package my.practice

object CrossDataList {
  def main(args: Array[String]): Unit = {

    val l = List(1,2,3,4,5)
    val l2 = List(2,3,4,5,6)

    var ll : List[Int] = List()

    for(i <- l; j <- l2 if(i == j)){
      ll = ll ::: i :: Nil  //::: concatenation of two lists
    }
    println(ll)
  }
}

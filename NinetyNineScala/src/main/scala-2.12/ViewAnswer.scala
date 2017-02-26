/**
  * Created by naoaki-sato on 17/02/23.
  */
object NinetyNineScala {
  val lst = List(1, 1, 2, 3, 5, 8)
  def main(args: Array[String]): Unit = {
    Log.d("p01", Problems.p01.last(lst) )
    Log.d("p02", Problems.p02.penultimate(lst) )
    Log.d("p03", Problems.p03.nth(2, lst) )
    Log.d("p04", Problems.p04.length(lst) )
    Log.d("p05", Problems.p05.reverse(lst) )
    Log.d("p06", Problems.p06.isPalindrome(List(1, 2, 3, 2, 1) ) )
    Log.d("p07", Problems.p07.flatten(List(List(1, 1), 2, List(3, List(5, 8) ) ) ) )
  }
}

// 出力用
object Log {
  def d(tag: Any, value: Any): Unit = {
    println(tag + " : " + value)
  }
}
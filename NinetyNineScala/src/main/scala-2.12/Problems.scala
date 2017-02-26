import java.util.NoSuchElementException
/**
  * Created by naoaki-sato on 17/02/23.
  */
object Problems {
  object p01 {
    // 関数の型パラメータが無いとTを解決できない
    def last[T](lst: List[T]): T = {
      lst match {
        case lst::Nil => lst
        case lst::x => last(x)
        case _ => throw new NoSuchElementException
      }
    }
  }

  object p02 {
    // x::y::zもいける
    def penultimate[T](lst: List[T]): T = {
      lst match {
        case x::y::Nil => x
        case x::y => penultimate(y)
        case _ => throw new NoSuchElementException
      }
    }
  }

  object p03 {
    // タプルを使用したマッチ
    def nth[T](num: Int, lst: List[T]): T = {
      (num, lst) match {
        case (0, x :: y) => x
        case (n, x :: y) => nth(n - 1, y)
        case _ => throw new NoSuchElementException
      }
    }
  }

  object p04 {
    def length[T](lst: List[T]): Int = {
      lst match {
        case Nil => 0
        case x :: y => 1 + length(y)
      }
    }
  }

  object p05 {
    // :::はList同士を結合するメソッド
    def reverse[T](lst: List[T]): List[T] = {
      lst match {
        case Nil => Nil
        case x :: y => reverse(y) ::: List(x)
        case _ => throw new NoSuchElementException
      }
    }
  }

  object p06 {
    def isPalindrome[T](lst: List[T]): Boolean = lst == lst.reverse
  }

  object p07 {
    def flatten[T](lst: List[T]): List[T] = {
      // 自分で考えた方針
      lst match {
        case Nil => Nil
        case (x: List[T]) :: (y: List[T]) => flatten(x) ::: flatten(y)
        case x :: (y: List[T]) => List(x) ::: flatten(y)
        case _ => throw new NoSuchElementException
      }
      // 解答例
//      lst flatMap {
//        case ms: List[_] => flatten(ms)
//        case e => List(e)
//      }
    }
  }

}

package org.hunter.challenge.solution.codility

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of array length 2
  */
object Lesson3_TapeEquilibrium {
  def main(args: Array[String]): Unit = {
    val a = Array[Int](1,1)
//    val a = Array[Int](3,1,2,4,3)
    println(solution(a))
  }

  /**
    * 100%
    * @param a
    * @return
    */
  def solution3(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    var sumLeft = a(0)
    val sumAll = a.sum
    var sumRight = sumAll - sumLeft
    var min = Math.abs(sumLeft - sumRight)
    if (a.length == 2) {
      return min
    }
    for (i <- 1 until a.length) {
      sumLeft = sumLeft + a(i)
      sumRight = sumAll - sumLeft

      val diff = Math.abs(sumLeft - sumRight)
      if (min > diff) {
        min = diff
      }

    }
    min
  }

  /**
    * 75%
    * @param a
    * @return
    */
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    def diff(arrLeft: Array[Int],sumLeft:Int,sumAll:Int,minDiff: Int): Int = {
      if (arrLeft.length == 1) minDiff
      else {
        val left = sumLeft + arrLeft.head
        val right = sumAll -  left
        val diffCur = Math.abs(left - right)
        diff(arrLeft.tail,left,sumAll,Math.min(diffCur, minDiff))
      }
    }
    a.length match {
      case 0 => 0
      case 1 => a.head
      case _ => diff(a,0,a.sum,Int.MaxValue)
    }
  }

  def solution2(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val temp = for (i <- 1 until a.length) yield getDiff(a, i)
    temp.min
  }

  def getDiff(a: Array[Int], i: Int): Int = {
    val (left, right) = a.splitAt(i)

    val leftSum = left.sum
    val rightSum = right.sum

    val diff = Math.abs(leftSum - rightSum)
    diff
  }


}

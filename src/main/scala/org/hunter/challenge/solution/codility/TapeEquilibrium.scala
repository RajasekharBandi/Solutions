package org.hunter.challenge.solution.codility

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of array length 2
  */
object TapeEquilibrium {
  def main(args: Array[String]): Unit = {
        val a = Array[Int](1000,-1000)
        println(solution(a))
//    val a = Array(1000,-1000)
//    val (left, right) = a.splitAt(0)
//    println(left.mkString(" "))
//    println(right.mkString(" "))

  }


  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    var sumLeft = a(0)
    val sumAll = a.sum
    var sumRight = sumAll - sumLeft
    var min = Math.abs(sumLeft - sumRight)
    if(a.length==2){
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

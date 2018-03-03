package org.hunter.challenge.solution.codility

import scala.util.Sorting

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of 110, trailing 0
  */
object Lesson4_MissingInteger {
  def main(args: Array[String]): Unit = {
    println(solution(Array[Int](-1, -2, 100)))
  }

  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val num = 1
    val set = a.toSet
    def getNum(set: Set[Int], num: Int): Int = {
      if (set.contains(num)) getNum(set, num + 1)
      else num
    }
    getNum(set, num)
  }
}

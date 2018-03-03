package org.hunter.challenge.solution.codility

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of 110, trim 0
  */
object Lesson1_BinaryGap {
  def main(args: Array[String]): Unit = {
    val num = 6
    println(solution(num))
  }

  def solution(n: Int): Int = {
    // write your code in Scala 2.12
    val str = Integer.toBinaryString(n)
    val trimStr = str.substring(0, str.lastIndexOf("1"))
    val arr = trimStr.split("1")

    val lenArr = arr.map(_.length)

    lenArr.length match {
      case 0 => 0
      case _ =>lenArr.max
    }
  }

}

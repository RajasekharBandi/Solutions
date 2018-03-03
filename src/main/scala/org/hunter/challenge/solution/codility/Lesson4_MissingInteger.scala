package org.hunter.challenge.solution.codility

import scala.util.Sorting

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of 110, trailing 0
  */
object Lesson4_MissingInteger {
  def main(args: Array[String]): Unit = {
    println(solution(Array[Int](-1,-2,100)))
  }

  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    var num=1
    val set=a.toSet
    while(set.contains(num)){
      num=num+1
    }
    return num

  }

}

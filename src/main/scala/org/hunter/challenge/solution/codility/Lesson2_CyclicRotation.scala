package org.hunter.challenge.solution.codility

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of empty array
  */
object Lesson2_CyclicRotation {
  def main(args: Array[String]): Unit = {
    val num = Array[Int](1,2,3,4)

    println(solution(num, 5).mkString(" "))
  }

  def solution(a: Array[Int], k: Int): Array[Int] = {
    // write your code in Scala 2.12
    if (a.length == 0) {
      return Array()
    }
    val left = a.take(a.length - k % a.length)
    val right = a.takeRight(k % a.length)
    right ++ left
  }

}

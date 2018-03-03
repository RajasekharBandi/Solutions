package org.hunter.challenge.solution.codility

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of 110, trailing 0
  */
object Lesson3_FrogJmp {
  def main(args: Array[String]): Unit = {
    val num = 6
    println(solution2(5, 6, 2))
    //    println(solution(10, 85, 30))
  }

  def solution(x: Int, y: Int, d: Int): Int = {
    val divider = Math.ceil((y - x) / d).toInt
    val modular = Math.ceil((y - x) % d).toInt

    modular match {
      case 0 => divider
      case _ => divider + 1
    }
  }

  def solution2(x: Int, y: Int, d: Int): Int = {
    (y-x + d -1)/d
  }

}

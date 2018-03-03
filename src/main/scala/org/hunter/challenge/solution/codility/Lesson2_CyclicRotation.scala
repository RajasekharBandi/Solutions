package org.hunter.challenge.solution.codility

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of empty array
  */
object Lesson2_CyclicRotation {
  def main(args: Array[String]): Unit = {
    val num = Array[Int]()

    println(solution(num,4).mkString(" "))
  }

  def solution(a: Array[Int], k: Int): Array[Int] = {

    // write your code in Scala 2.12
    if(a.length==0){
      return Array()
    }
    val left=a.drop(a.length-k%a.length)
    val right=a.dropRight(k%a.length)
    left ++ right
  }

}

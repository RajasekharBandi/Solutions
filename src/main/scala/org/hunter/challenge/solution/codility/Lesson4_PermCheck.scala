package org.hunter.challenge.solution.codility

import scala.util.Sorting

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of 110, trailing 0
  */
object Lesson4_PermCheck {
  def main(args: Array[String]): Unit = {
    println(solution(Array[Int](4,1,3)))
  }

  def solution(a: Array[Int]): Int={
    Sorting.quickSort(a)

    for(i<-0 until a.length){
      if(a(i)!=i+1){
        return 0
      }
    }

    return 1
  }

}

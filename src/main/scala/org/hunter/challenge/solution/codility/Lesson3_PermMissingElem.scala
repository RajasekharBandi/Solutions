package org.hunter.challenge.solution.codility

import scala.util.Sorting

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of missing first or last element
  */
object Lesson3_PermMissingElem {
  def main(args: Array[String]): Unit = {

    val arr = Array[Int](1, 2, 3, 4)
    println(solution(arr))
  }

  def solution(a: Array[Int]): Int = {
    if (a.isEmpty) {
      return 1
    }

    Sorting.quickSort(a)
    val head = a.head
    if(head!=1){
      return 1
    }
    for (i <- 0 until a.length) {
      if ((head + i) != a(i)) {
        return head + i
      }
    }
    return a.last + 1
  }

}

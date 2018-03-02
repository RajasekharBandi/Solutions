package org.hunter.challenge.solution.codility

import scala.collection.mutable.{Set => mSet}

/**
  * Created by Hunter on 2/03/2018.
  *
  *
  */
object OddOccurrencesInArray {
  def main(args: Array[String]): Unit = {
    val num = Array(9, 3, 9, 3, 7)

    println(solution(num))
  }

  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val set = mSet[Int]()
    for (element <- a) {
      if (set.contains(element)) {
        set -= element
      } else {
        set += element
      }
    }
    return set.head
  }

}

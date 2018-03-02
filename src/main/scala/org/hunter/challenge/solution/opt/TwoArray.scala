package org.hunter.challenge.solution.opt

/**
  * Created by Hunter on 2/03/2018.
  */
object TwoArray {
  def main(args: Array[String]): Unit = {
    val a = Array(5, 3, 7, 7, 10)
    val b = Array(1, 6, 6, 9, 9)

    println(solution(a, b))

  }

  def solution(a: Array[Int], b: Array[Int]): Int = {
    // write your code in Scala 2.12
    var count = 0
    for (i <- 0 until a.length - 1) {
      if (a(i) >= a(i + 1) || b(i) >= b(i + 1)) {
        if (a(i) < b(i + 1) && b(i) < a(i + 1)) {
          val temp = a(i + 1)
          a(i + 1) = b(i + 1)
          b(i + 1) = temp
          count = count + 1
        } else {
          return -1
        }
      }
    }
    return count
  }

  def solution2(a: Array[Int], b: Array[Int]): Int = {
    import scala.util.Sorting
    // write your code in Scala 2.12
    val cloneA = a.clone()
    val cloneB = b.clone()

    Sorting.quickSort(cloneA)
    Sorting.quickSort(cloneB)

    var count = 0

    if (a.deep == cloneA.deep && b.deep == cloneB.deep) {
      return 0
    } else {
      for (i <- 0 until a.length - 1) {
        if (a(i) >= a(i + 1) || b(i) >= b(i + 1)) {
          if (a(i) < b(i + 1) && b(i) < a(i + 1)) {
            val temp = a(i + 1)
            a(i + 1) = b(i + 1)
            b(i + 1) = temp
            count = count + 1
          } else {
            return -1
          }
        }
      }

      return count
    }
  }

}

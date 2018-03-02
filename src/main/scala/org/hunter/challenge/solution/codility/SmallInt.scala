package org.hunter.challenge.solution.codility

import scala.util.Sorting

/**
  * Created by Hunter on 2/03/2018.
  */
object SmallInt {
  def main(args: Array[String]): Unit = {
    val arr=Array(1, 3, 6, 4, 1, 2)
    println(solution(arr))
  }

  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    Sorting.quickSort(a)

    if(a.last<0){
      return 1
    }else{
      val greatThanZero=a.dropWhile(_<0)
      for(i<- 0 until greatThanZero.length){
        val num=greatThanZero(i)+1

        if(!greatThanZero.contains(num)){
          return num
        }
      }
    }
    return 0
  }

}

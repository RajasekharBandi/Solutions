package org.hunter.challenge.solution.codility

import scala.util.Sorting

/**
  * Created by Hunter on 2/03/2018.
  *
  * take care of 110, trailing 0
  */
object Lesson4_PermCheck {
  def main(args: Array[String]): Unit = {
    println(solution(Array[Int](1,2,3)))
  }

  /**
    * 100%
    * @param a
    * @return
    */
  def solution2(a: Array[Int]): Int={
    Sorting.quickSort(a)

    for(i<-0 until a.length){
      if(a(i)!=i+1){
        return 0
      }
    }

    return 1
  }

  /**
    * 72%
    * @param a
    * @return
    */
  def solution(a: Array[Int]): Int={
    Sorting.quickSort(a)

    def getNum(arr:Array[Int],num:Int):Int={
      if(arr.isEmpty) 1
      else if(arr.head!=num+1) 0
      else getNum(arr.tail,num+1)
    }
    getNum(a,0)
  }



}

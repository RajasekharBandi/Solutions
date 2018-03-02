package org.hunter.challenge.solution.codility

/**
  * Created by Hunter on 2/03/2018.
  */
object BinaryGap {
  def main(args: Array[String]): Unit = {
    val num=6
    println(solution(num))
  }

  def solution(n: Int): Int = {
    // write your code in Scala 2.12
    val str=Integer.toBinaryString(n)
    val trailingStr=str.substring(0,str.lastIndexOf("1"))
    val arr=trailingStr.split("1")
    var max=0

    for(i<-0 until arr.length){
      if(max<arr(i).length()){
        max=arr(i).length()
      }
    }
    return max
  }

}

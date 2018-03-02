package org.hunter.challenge.solution.opt

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Hunter on 1/03/2018.
  */
object A438Anagrams {
  def main(args: Array[String]): Unit = {
    val arr=findAnagrams("cbaebabacdcba","abc")

    println(arr.mkString(" "))

  }

  def findAnagrams(s: String, p: String): List[Int] = {
    val sortedStr=p.sorted
    val strLen=sortedStr.length
    val ab=new ArrayBuffer[Int]()

    for(i<- 0 to s.length-strLen){
      val partStr=s.substring(i,strLen+i)
      val sortedPart=partStr.sorted

      if(sortedPart.equals(sortedStr)){
        ab.append(i)
      }

    }

//    println(sortedStr)
//    println(strLen)
    ab.toList

  }

}

package org.hunter.challenge.solution.opt

/**
  * Created by Hunter on 1/03/2018.
  */
object A686StringMatch {
  def main(args: Array[String]): Unit = {

    println(repeatedStringMatch("abababaaba","aabaaba"))


    //abcdabcd

  }

  def repeatedStringMatch(A: String, B: String): Int = {
    val bLen=B.length
    val sb=new StringBuilder
    sb.append(A)
    var i=1
    while(sb.length<=bLen+2*A.length){
      if(sb.containsSlice(B)){
        return i
      }else{
        i=i+1
        sb.append(A)
      }
    }

    return -1
  }

}

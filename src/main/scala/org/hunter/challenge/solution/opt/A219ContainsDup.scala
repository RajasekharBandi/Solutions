package org.hunter.challenge.solution.opt

/**
  * Created by Hunter on 1/03/2018.
  */
object A219ContainsDup {
  def main(args: Array[String]): Unit = {
    val arr=Array(1)
    println(containsNearbyDuplicate2(arr,1))
//    println(arr.contains(2))

  }

  def containsNearbyDuplicate2(nums: Array[Int], k: Int): Boolean = {
    if(nums.length>1){
      for(i<- 0 until nums.length){
        val cur=nums(i)
        val right=nums.drop(i)

        if(right.contains(cur)){
          val part=right.indexOf(cur)
          if(part<k){
            return true
          }
        }
      }
    }

    return false
  }

  def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
    val len=nums.length
    if(k>len){
      return false
    }else{
      for(i<-0 until len){
        if(i+k<len){
          if(nums(i)==nums(i+k)){
            return true
          }
        }else{
          return false
        }

      }
      return false
    }

  }

}

package org.hunter.challenge.solution.opt

/**
  * Created by Hunter on 2/03/2018.
  *
  */
object Challenge {
  def main(args: Array[String]): Unit = {
    val str = "-1,-2"
    val arr=Array("-1","-2")

    println((arr.last+"").toInt)
//    "-1".toInt
//    println("-1".toInt)
//    println(solution(str))

  }

  def solution(x: String): String = {
    // write your code in Scala 2.12
    if (x.isEmpty) {
      return "0"
    }
    val arr = x.split(",")
    val res = arr.fold("")(sum(_, _, "", 0))
    res
  }

  def sum(x: String, y: String, res: String, modular: Int): String = {
    val (a, b) = complementary(x, y)
    if (a.isEmpty && b.isEmpty) {
      if (modular == 0) {
        return res
      } else {
        return modular + res
      }
    } else {
      val oneSum = (a.last + "").toInt + (b.last + "").toInt + modular
      val sumModular = oneSum % 10 //5
      val sumDiv = oneSum / 10 //1

      sum(a.init, b.init, "" + sumModular + res, sumDiv)
    }

  }

  def complementary(a: String, b: String): (String, String) = {
    val lenA = a.length
    val lenB = b.length
    val diff = Math.abs(lenA - lenB)
    if (lenA > lenB) {
      return (a, "0" * diff + b)
    } else {
      return ("0" * diff + a, b)
    }

  }

}

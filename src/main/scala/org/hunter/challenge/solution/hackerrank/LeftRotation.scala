package org.hunter.challenge.solution.hackerrank

/**
  * Created by Hunter on 1/03/2018.
  */
object LeftRotation {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = new Array[Int](n)
    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt()
    }

    val rotate=a.dropRight(n-k)
    val left=a.drop(k)

    val rotation=left ++ rotate

    println(rotation.mkString(" "))

  }

}

package org.hunter.challenge.solution.opt

import scala.collection.mutable

/**
  * Created by Hunter on 1/03/2018.
  */
object Queues {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val num = sc.nextInt()
    val queue = new mutable.Queue[String]()

    for (i <- 0 to num) {
      val input = sc.nextLine()
//      println(input)
      val op = input.split(" ")(0)
      if (op.equals("1")) {
        queue.enqueue(input.split(" ")(1))
      } else if (op.equals("2")) {
        queue.dequeue()
      } else if (op.equals("3")) {
        println(queue.front)
      }
    }

  }

}

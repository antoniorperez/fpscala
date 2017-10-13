

package scala.frp.chapter2

import scala.annotation.tailrec
import sun.security.util.Length

object Chapter2 {

  /**
   * Exercise 2.1
   */
  def fib(n: Int): Int = {
    @tailrec
    def loop(v1: Int, v2: Int, n: Int): Int = {
      if (n == 1)
        v2
      else if (n == 0)
        v1
      else
        loop(v2, v2 + v1, n - 1)
    }
    loop(0, 1, n)
  }

  /**
   * Exercise 2.2
   */
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def loop(n: Int): Boolean = {
      if (n == as.length - 1)
        true
      else
        ordered(as(n), as(n + 1)) && loop(n + 1)
    }
    loop(0)

  }

  /**
   * Exercise 2.3
   */
  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  /**
   * Exercise 2.4
   */
  def uncurry[A, B, C](f: A => B => C): (A, B) => C =
    (a: A, b: B) => f(a)(b)

  /**
   * Exercise 2.5
   */
  def compose[A, B, C](f: B => C, g: A => B): A => C =
    (a: A) => f(g(a))

}
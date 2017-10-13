package scala.frp.chapter3

import scala.annotation.tailrec

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil         => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil          => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs)  => x * product(xs)
  }
  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

  /**
   * Exercise 3.2
   */
  def tail[A](as: List[A]): List[A] = as match {
    case Nil         => Nil
    case Cons(x, xs) => xs
  }

  /**
   * Exercise 3.3
   */
  def setHead[A](as: List[A], head: A) = as match {
    case Nil         => Nil
    case Cons(x, xs) => Cons(head, xs)
  }

  /**
   * Exercise 3.4
   */
  @tailrec
  def drop[A](l: List[A], n: Int): List[A] = l match {
    case Nil         => Nil
    case Cons(x, xs) => if (n > 0) drop(xs, n - 1) else l
  }

  /**
   * Exercise 3.5
   */
  @tailrec
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Nil         => Nil
    case Cons(x, xs) => if (f(x)) dropWhile(xs, f) else l
  }

  /**
   * Exercise 3.6
   */
  def init[A](l: List[A]): List[A] = l match {
    case Nil          => Nil
    case Cons(x, Nil) => Nil
    case Cons(x, xs)  => Cons(x, init(xs))
  }

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B =
    as match {
      case Nil         => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }

  /**
   * Exercise 3.9
   */
  def length[A](as: List[A]): Int = foldRight(as, 0)((_, b) => b + 1)

  /**
   * Exercise 3.10
   */
  @tailrec
  def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B = as match {
    case Nil         => z
    case Cons(x, xs) => foldLeft(xs, f(z, x))(f)
  }

  /**
   * Exercise 3.11
   */

  def sum2(ns: List[Int]) =
    foldLeft(ns, 0)((x, y) => x + y)

  def product2(ns: List[Double]) =
    foldLeft(ns, 1.0)(_ * _)
    
  def length2[A](as: List[A]): Int = foldLeft(as, 0)((b, _) => b + 1)


}
package scala.frp.chapter2

import scala.frp.chapter2.Chapter2._

object Chapter2Worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  List.range(0, 10).map(fib)                      //> res0: List[Int] = List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)

  val as = List.range(1, 100).toArray             //> as  : Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 
                                                  //| 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 
                                                  //| 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 
                                                  //| 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 
                                                  //| 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 
                                                  //| 92, 93, 94, 95, 96, 97, 98, 99)

  def order(a: Int, b: Int): Boolean =
    a > b                                         //> order: (a: Int, b: Int)Boolean
    
    
  isSorted(as, order)                             //> res1: Boolean = false

}
package scala.frp.chapter2

import scala.frp.chapter2.Chapter2._

object Chapter2Worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(136); 
  println("Welcome to the Scala worksheet");$skip(30); val res$0 = 

  List.range(0, 10).map(fib);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(39); 

  val as = List.range(1, 100).toArray;System.out.println("""as  : Array[Int] = """ + $show(as ));$skip(50); 

  def order(a: Int, b: Int): Boolean =
    a > b;System.out.println("""order: (a: Int, b: Int)Boolean""");$skip(32); val res$1 = 
    
    
  isSorted(as, order);System.out.println("""res1: Boolean = """ + $show(res$1))}

}

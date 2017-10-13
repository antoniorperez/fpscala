package scala.frp.chapter3


object Chapter3Worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(378); 

  val x = List(1, 2, 3, 4, 5) match {
    case Cons(x, Cons(2, Cons(4, _)))          => x
    case Nil                                   => 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case Cons(h, t)                            => h +List.sum(t)
    case _                                     => 101
  };System.out.println("""x  : Int = """ + $show(x ));$skip(20); val res$0 = 
  
  List.tail(Nil);System.out.println("""res0: scala.frp.chapter3.List[Nothing] = """ + $show(res$0));$skip(39); val res$1 = 
  
  List.setHead(List(1,2,3,4,5), 99);System.out.println("""res1: Product with Serializable with scala.frp.chapter3.List[Int] = """ + $show(res$1));$skip(31); val res$2 = 
  List.drop(List(1,2,3,4,5),3);System.out.println("""res2: scala.frp.chapter3.List[Int] = """ + $show(res$2));$skip(58); val res$3 = 
  
  List.dropWhile(List(1,2,3,4,5,6), (x : Int) => x <5);System.out.println("""res3: scala.frp.chapter3.List[Int] = """ + $show(res$3));$skip(30); val res$4 = 
  
  List.init(List(1,2,3,4));System.out.println("""res4: scala.frp.chapter3.List[Int] = """ + $show(res$4));$skip(62); val res$5 = 
  
  
  List.foldRight(List(1,2,3), Nil:List[Int])(Cons(_,_));System.out.println("""res5: scala.frp.chapter3.List[Int] = """ + $show(res$5));$skip(36); val res$6 = 
  
  
  List.length2(List(2,3,4,5));System.out.println("""res6: Int = """ + $show(res$6));$skip(30); val res$7 = 
  
  List.sum2(List(2,3,4,5));System.out.println("""res7: Int = """ + $show(res$7));$skip(34); val res$8 = 
  
  List.product2(List(2,3,4,5));System.out.println("""res8: Double = """ + $show(res$8))}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}

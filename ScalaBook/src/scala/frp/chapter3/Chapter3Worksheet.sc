package scala.frp.chapter3


object Chapter3Worksheet {

  val x = List(1, 2, 3, 4, 5) match {
    case Cons(x, Cons(2, Cons(4, _)))          => x
    case Nil                                   => 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case Cons(h, t)                            => h +List.sum(t)
    case _                                     => 101
  }                                               //> x  : Int = 3
  
  List.tail(Nil)                                  //> res0: scala.frp.chapter3.List[Nothing] = Nil
  
  List.setHead(List(1,2,3,4,5), 99)               //> res1: Product with Serializable with scala.frp.chapter3.List[Int] = Cons(99,
                                                  //| Cons(2,Cons(3,Cons(4,Cons(5,Nil)))))
  List.drop(List(1,2,3,4,5),3)                    //> res2: scala.frp.chapter3.List[Int] = Cons(4,Cons(5,Nil))
  
  List.dropWhile(List(1,2,3,4,5,6), (x : Int) => x <5)
                                                  //> res3: scala.frp.chapter3.List[Int] = Cons(5,Cons(6,Nil))
  
  List.init(List(1,2,3,4))                        //> res4: scala.frp.chapter3.List[Int] = Cons(1,Cons(2,Cons(3,Nil)))
  
  
  List.foldRight(List(1,2,3), Nil:List[Int])(Cons(_,_))
                                                  //> res5: scala.frp.chapter3.List[Int] = Cons(1,Cons(2,Cons(3,Nil)))
  
  
  List.length2(List(2,3,4,5))                     //> res6: Int = 4
  
  List.sum2(List(2,3,4,5))                        //> res7: Int = 14
  
  List.product2(List(2,3,4,5))                    //> res8: Double = 120.0
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
package ScalaBasic

// http://homepage.divms.uiowa.edu/~tinelli/classes/022/Fall13/Code/scala-examples-3.scala


object CaseHeadTailNil extends App{

    def flatten(ls: List[_]): List[Int] = ls match{
        case  Nil => Nil
        case  (a:  Int) :: tail => a :: flatten(tail)
        case  (a : List[_]) :: tail => flatten(a) ::: flatten(tail)
        case _ :: tail => flatten(tail)
    }

    def len(l: List[Int]): Int = 
      l match {
        case Nil    => 0           // return 0 if the list is null 
        case _ :: t => 1 + len(t)  // len += 1 if the element of list is not null
      }

    def min(l: List[Int]): Int = 
      l match {
          case Nil => throw new IllegalArgumentException  // return IllegalArgumentException if list is null
          case n :: Nil  => n    // return n if only first element is not null, but rest of them are null
          case n :: t => {       // if both first (head) and the rest of elements (tail) are not null, then compare with each them and find the min
            val m = min(t)
            if (n < m) n else m
          }
      }

    // *** important properties  *** //
    val x = List(1,2,3)
    println(x.head)     // 1
    println(x.tail)     // List(2, 3)
    println(x.length)   // 3
    println(Nil == List())  // true 

    val y = 6 :: Nil 
    println(y)     // List(6)
    val z = 5 :: y
    println(z)    // List(5,6)
    println(z.tail eq y)   // true

    val s = 3 :: 4 :: Nil
    println(s)   // List(3,4)

    // test 1 
    println(flatten(List(List("one",9,8),3,"str",4,List(true,77,3.2)))) // List(9, 8, 3, 4, 77)
    println(flatten(List()))
    println(flatten(List((1,2,3,List(4,5,6)))))

    // test 2
    println(len(List()))
    println(len(List(1,2,3)))

    // test 3
    //println(min(List()))    // IllegalArgumentException
    println(min(List(1,2,3)))
    println(min(List(10,9,8)))


}
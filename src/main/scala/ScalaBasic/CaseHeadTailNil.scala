package ScalaBasic

// http://homepage.divms.uiowa.edu/~tinelli/classes/022/Fall13/Code/scala-examples-3.scala


object CaseHeadTailNil extends App{

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

    def concat(l: List[Int], m: List[Int]): List[Int] = 
        l match {
            case Nil => m
            case h :: t =>  h :: concat(t, m) 
        }

    def reverse(l: List[Int]): List[Int] = 
        l match {
            case Nil => l
            case h :: t  => {
                val rt = reverse(t)
                val lh = List(h)
                concat(rt, lh)
            } 
        }

    def reverseV2(l:List[Int]):List[Int] =
          l match {
            case Nil  => l
            case h :: t => concat(reverse(t), List(h))
          }

    def reverseV3 (x:List[Int]):List[Int] = {

          def rev (l:List[Int], rl:List[Int]):List[Int] = 
          l match {
            // when l has a head h and a tail t, put h in front of rl
            // and continue with t and h::rl
            case h :: t => rev(t, h :: rl)
            // when l is Nil, rl contains by construction the reverse
            // of the original list
            case Nil => rl
          }

          rev(x, Nil)
        }

    def flatten(ls: List[_]): List[Int] = ls match{
        case  Nil => Nil
        case  (a:  Int) :: tail => a :: flatten(tail)
        case  (a : List[_]) :: tail => flatten(a) ::: flatten(tail)
        case _ :: tail => flatten(tail)
    }

    // *** important concepts  *** //
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

    // the effect of concat is achieved with the predefined overloaded operator ++
    List(1,2) ++ List(3,4,5)  // List(1,2,3,4,5  )

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

    // test 4
    println(concat(List(1,2,3), List(4,5,6)))
    println(concat(List(1,2,3), List(1,2,3)))


    // test 3
    println(reverse(List()))   
    println(reverse(List(1,2,3)))
    println(reverse(List(10,9,8)))

}
package ScalaBasic

object ScalaArrayDemo{

    def main(args: Array[String]){
       /*
        * define static array
        */

        // init nums array with length = 10, all element = 0
        val nums = new Array[Int](10)
        println(nums)

        // init nums array with length = 10, all element = null
        val nums2 = new Array(10)
        println(nums2)

        val s = Array("google", "hello", "world")
        println(s)
        println(s(0))
        println(s(1))

       /*
        * define dynamic array
        */

        import scala.collection.mutable.ArrayBuffer

        val b = ArrayBuffer[Int]()
        println(b)
        b += 1 
        println(b)
        b += (1,2,3,4,5)
        println(b)
        b ++= Array(98,99,100)

        // remove last 5 elements
        b.trimEnd(5)
        println(b)

        // insert elements 
        b.insert(2,6)
        println(b)
        b.insert(2,7,8,9)
        println(b)

        // remove elements
        b.remove(2)
        b.remove(2,3)

        // transform to array 
        val x = b.toArray
        println(b)
        println(x)

        // go through array 
        val a = "helloworld"
        for (i <- 0 until a.length) 
        println("elelment " + i + ":" + a(i))

        // go through with gap
        for (i <- 0 until (a.length, 2))
        println(i)

        // go through reverse
        for (i <- (0 until a.length).reverse)
        println(i)

        // transform array
        val c = Array(2,3,5,7,11)
        val result = for (elem <- c) yield elem * 2
        println(result)

        // transform array with condition
        val result2 = for (elem <- c if elem % 2 == 0 ) yield elem * 2
        println(result2)

        // transform array with condition (fp style)
        val result3 = c.filter( _ % 2 == 0).map(2 * _)
        println(result3)

        // common op
        val d = Array(4,5,10,1,3)
        println(d.sum)

        val dSorted = d.sorted
        println(dSorted

        val dDescending = d.sortWith(_ > _)
        println(dDescending)

        // toString 
        val a = Array(1,7,2,9)
        a.mkString(" and ")
        a.mkString("<", ",", ">")

        // multi dimension array
        val matrix = Array.ofDim[Double](3,4)
        println(matrix)

        val triangle = new Array[Array[Int]](10)
        println(triangle)
        for (i <- 0 until triangle.length)
            triangle(i) = new Array[Int](i + 1)

        println(triangle)

    }
}
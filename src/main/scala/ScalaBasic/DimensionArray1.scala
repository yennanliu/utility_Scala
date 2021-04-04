package ScalaBasic

// https://www.youtube.com/watch?v=7_XXrt8e5UA&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=120

object DimensionArray1 extends App {

  // 1-D Array
  val arr_1d = Array.ofDim[Double](1)

  println("==============")

  // 2-D array
  /*
   *    1) make a 2-D array with 3 rows, 5 columns
   *    2) the underlying java code is still similar:
   *        ```java
   *        int [][] arr_2d = (int[][])Array..MODULE$.ofDim(3,5, ClassTag..Module$.Int());
   *        arr_2d(1)(1) = 3.1;
   *        arr_2d(0)(0) = 99;
   *        ```
   */
  val arr_2d = Array.ofDim[Double](3,5)
  arr_2d(1)(1) = 3.1
  arr_2d(0)(0) = 99
  for (arr <- arr_2d){ // arr is 1-D array
    for (j <- arr){
      print(j + " ")
    }
    println()
  }

  println("==============")

  // 3-D array
  val arr_3d = Array.ofDim[Double](3,5, 6)

}

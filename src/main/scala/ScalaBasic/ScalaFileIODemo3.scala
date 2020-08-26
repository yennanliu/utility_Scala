// package ScalaBasic

// // https://stackoverflow.com/questions/27360977/how-to-read-files-from-resources-folder-in-scala

// import scala.io.Source

// object ScalaFileIODemo3 extends App{

//     // Scala 2.12.x && 2.13.x reading a resource
//     val mytxt = scala.io.Source.fromResource("README.md").getLines
//     for (i <- mytxt)
//         println (i)

//     // reading resources prior 2.12 (still my favourite due to jar compatibility)
//     // jar compatibility (via this method)
//     val stream = getClass.getResourceAsStream("/README.md")
//     val mytxt2 = scala.io.Source.fromInputStream( stream )
//         .getLines()
//         .toList

//     for (i <- mytxt2)
//         println(i)
  
// }
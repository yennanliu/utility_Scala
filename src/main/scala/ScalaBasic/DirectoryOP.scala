package ScalaBasic

import java.io.File

object DirectoryOP extends App{

    def subdirs(dir: File): Iterator[File] = {
        val children = dir.listFiles.filter( _.isDirectory )
        children.toIterator ++ children.toIterator.flatMap( subdirs _ )
    }

    // run the process
    val dir = new File(".")
    for (d <- subdirs(dir))
        println (d)

    val dir2 = new File("SparkScala")
    for (d <- subdirs(dir2))
        println (d)
}
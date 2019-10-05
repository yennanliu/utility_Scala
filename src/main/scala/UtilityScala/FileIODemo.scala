import scala.io.Source
import java.io._

object FileIODemo {
  def main(args: Array[String]) {
    println("read from file... (README.md)")
    print_file()
    println("write to file... (scala_writed_file.txt)")
    write_file()
  }

  def print_file() {
    Source.fromFile("README.md").foreach {
      print
    }
  }

  def write_file() {
    val writer = new PrintWriter(new File("scala_writed_file.txt"))
    writer.write("this is from scala IO")
    writer.close()
  }
}

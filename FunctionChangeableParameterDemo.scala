object FunctionChangeableParameterDemo {
  def main(args: Array[String]) {
    printStrings("Runoob", "Scala", "Python");
    printStrings("Runoob", "Scala", "Python", "C", "JS");
    printStrings("1", "2", "3", "4", "5", "[1,2,3]");
    //printStrings2("1", "2", "3", "4", "5", "[1,2,3]");
  }
  // last var in scala func in changeable
  def printStrings(args: String*) = {
    var i: Int = 0;
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }

  def printStrings2(args: String) = {
    var i: Int = 0;
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }

}

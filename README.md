# utility_Scala

## Quick start

```bash
# METHOD 1) run scala hello world 
$ git clone https://github.com/yennanliu/utility_Scala.git
$ cd utility_Scala
$ scala HelloWorld.scala 
$ Hello World

# METHOD 2) run scala spark hello world
$ cd utility_Scala
$ spark-submit \
  --class "SimpleApp" \
  --master local[4] \
  target/scala-2.11/simple-project_2.11-1.0.jar


# METHOD 3) run scala spark hello world via sbt 
$ cd utility_Scala
$ sbt package
$ sbt
# inside sbt console
sbt:Simple Project> run 
# [warn] Multiple main classes detected.  Run 'show discoveredMainClasses' to see the list

# Multiple main classes detected, select one to run:

#  [1] AnonymousFuncDemo
#  [2] ClassDemo
#  [3] FileIODemo
#  [4] ForLoopDemo
#  [5] FunctionChangeableParameterDemo
#  [6] FunctionCompositionDemo
#  [7] HelloWorld
#  [8] IfElseDemo
#  [9] OperatorDemo
#  [10] PatterMatchDemo
#  [11] SimpleApp
#  [12] Test
#  [13] UderDefinedDefaultParamFuncDemo
#  [14] UderDefinedFuncDemo

Enter number: 11

# [info] Running SimpleApp 
# ...
#  >>>>>>>>>>>>>> OUTPUT
# Lines with a: 21, Lines with b: 9
#  >>>>>>>>>>>>>> OUTPUT
# ...

```

## Development 

- Trouble shooting 
	- if facing `Origin location must be absolute error in building a SBT project` like [errors](https://github.com/yennanliu/utility_Scala/blob/master/doc/origin_location_must_be_absolute_error.txt) when sbt build (`sbt package`), try to clean the sbt cache : `rm -fr ~/.ivy2` (remove entire .ivy2 file then build the project again) 
	- https://www.scala-sbt.org/1.x/docs/Dependency-Management-Flow.html

## Ref 
- Scala Tutorial  
	- https://www.javatpoint.com/scala-tutorial
	- https://www.tutorialspoint.com/scala/
	- http://www.runoob.com/scala/scala-basic-syntax.html

- Build Scala Spark project with sbt 
	- http://xd-deng.com/render_html/step_by_step_to_package_spark_app_scala.html

- sbt manual 
	- https://www.scala-sbt.org/1.x/docs/index.html

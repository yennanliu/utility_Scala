# utility_Scala

## Scala Projects 
* [spark_emr_dev](https://github.com/yennanliu/spark_emr_dev) - Demo of submitting Hadoop ecosystem jobs to AWS EMR
* [spark-etl-pipeline](https://github.com/yennanliu/spark-etl-pipeline) - Demo of various Spark ETL processes
* [utility_Scala](https://github.com/yennanliu/utility_Scala) - Scala/Spark programming basic demo 

## Main files

1. [Utility Scala](https://github.com/yennanliu/utility_Scala/tree/master/src/main/scala/UtilityScala)
2. [Spark Scala Demo](https://github.com/yennanliu/utility_Scala/tree/master/src/main/scala/SparkDemo)
3. Scala basic
	- [Scala_basic_demo_1](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/scala_basic_demo_1.scala)
	- [Scala_basic_demo_2](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/scala_basic_demo_2.scala)
	- [Scala_basic_demo_3](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/scala_basic_demo_3.scala)

4. Spark basic
	- [Spark_basic_demo_1](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/spark_basic_demo_1.scala)

## Quick start

```bash

# DEMO 1) run scala hello world 
$ git clone https://github.com/yennanliu/utility_Scala.git
$ cd utility_Scala
$ scala src/main/scala/UtilityScala/HelloWorld.scala 
#$ Hello World


# DEMO 2) run scala spark hello world via sbt 
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

# DEMO 3) run scala spark hello world
$ cd utility_Scala
$ sbt clean compile && sbt assembly 
$ spark-submit \
  --class "SimpleApp" \
  --master local[4] \
  target/scala-2.11/simple-project_2.11-1.0.jar

```

## Development 

- Trouble shooting 
	- if facing `Origin location must be absolute error in building a SBT project` like [errors](https://github.com/yennanliu/utility_Scala/blob/master/doc/origin_location_must_be_absolute_error.txt) when sbt build (`sbt package`), try to clean the sbt cache via `rm -fr ~/.ivy2` (remove entire .ivy2 file), then build the project again
	- https://www.scala-sbt.org/1.x/docs/Dependency-Management-Flow.html

## Ref 

<details>
<summary>Ref</summary>

- Scala Tutorial  
	- https://docs.scala-lang.org/tour/basics.html
	- https://www.javatpoint.com/scala-tutorial
	- https://www.tutorialspoint.com/scala/
	- http://www.runoob.com/scala/scala-basic-syntax.html
	- https://ithelp.ithome.com.tw/users/20107343/ironman/1301?page=1

- Build Scala Spark project with sbt 
	- http://xd-deng.com/render_html/step_by_step_to_package_spark_app_scala.html

- sbt manual 
	- https://www.scala-sbt.org/1.x/docs/index.html

- scala test 
	- http://www.scalatest.org/user_guide/using_scalatest_with_sbt

- Scala spark source code tutorial  
	 - https://github.com/lw-lin/CoolplaySpark

- Kafka with scala spark demo 
	- https://github.com/spirom/spark-streaming-with-kafka

- Spark scala test 
	- http://mkuthan.github.io/blog/2015/03/01/spark-unit-testing/

- Spark scala tutorial 
	- http://allaboutscala.com/big-data/spark/

</details>
# Utility_Scala
> Introduction of `Scala programming language` as well as `Spark Scala` via couples of basic scripts in common use cases. Please check the [Main files](https://github.com/yennanliu/utility_Scala#main-files) for more information.

<p align="center"><img src ="https://github.com/yennanliu/utility_Scala/blob/master/doc/pic/scala_data_type.svg" width="1000" height="500"></p>


## Scala Projects 
* [spark_emr_dev](https://github.com/yennanliu/spark_emr_dev) - Demo of submitting Hadoop ecosystem jobs to AWS EMR
* [spark-etl-pipeline](https://github.com/yennanliu/spark-etl-pipeline) - Demo of various Spark ETL processes
* [utility_Scala](https://github.com/yennanliu/utility_Scala) - Scala/Spark programming basic demo 

## Main Files
1. [Utility Scala](https://github.com/yennanliu/utility_Scala/tree/master/src/main/scala/UtilityScala)
2. [Spark Scala Demo](https://github.com/yennanliu/utility_Scala/tree/master/src/main/scala/SparkDemo)
3. Scala basic
	- [ScalaIfElseMatchForloop](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/ScalaIfElseMatchForloop.scala) - Scala `if, else, while, match` basic 
	- [ScalaFunction_1](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/ScalaFunction_1.scala) - Scala `function, lambda` basic
	- [ScalaFunction_2](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/ScalaFunction_2.scala) - Scala `function with dynamic var length` 
	- [Scala_basic_demo_3](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/scala_basic_demo_3.scala) - Scala basic data structrue : `array, list, tuple`, apply `function, lambda` with them basic. And `map, exception` demo
	- [Scala_basic_demo_4](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/scala_basic_demo_4.scala) - Scala `try, exception`, `error handling` demo
	- [ScalaFileIODemo](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/ScalaFileIODemo.scala) - Scala file IO basic
	- [ScalaLazyDemo](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/LazyDemo.scala) - Scala lazy value demo
	- [ScalaUnitDemo](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/UnitDemo.scala) - Scala function with `no return value` called as `procedure`, with return type `Unit`
	- [ScalaArrayDemo](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/ScalaArrayDemo.scala) - Scala `Array` basic op, properties
	- [ScalaHashMap](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/ScalaHashMap.scala) - Scala `Hash Map` basic op, properties
	- [ScalaClassDemo](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/ScalaBasic/ScalaClassDemo.scala) - Scala `class` basic op, properties

4. Spark basic
	- [Spark_basic_demo_1](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/spark_basic_demo_1.scala) - Spark `function `basic demo
	- [Spark_basic_demo_2](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/spark_basic_demo_2.scala) - Spark `RDD basic op` demo : count avg friends by age
		- [Spark_basic_demo_2 extra](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/spark_basic_demo_2_extra.scala) - Extra : count avg friend by first name
	- [Spark_basic_demo_3](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/spark_basic_demo_3.scala) - Spark `RDD filter` demo : min temp on each station (weather data)
	- [Spark_basic_demo_4](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/spark_basic_demo_4.scala) - Spark `RDD flatMap` demo : word count (book data)
		- [Spark_basic_demo_4 extra](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/spark_basic_demo_4_extra.scala) - Extra : word count with `regular expression` preprocess
	- [PopularMoviesNicer](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/PopularMoviesNicer.scala) - Spark `broadcast` demo :  movie-lens data (ml-100k)
	- [MostPopularSuperhero](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/MostPopularSuperhero.scala) - `Lookup` values from `RDD` and `map them to another RDD`, and options method in Spark
	- [DegreesOfSeparation](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/DegreesOfSeparation.scala) - Code `BFS (Breadth-first search)`from scratch via spark 
	- [MovieSimilarities](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/MovieSimilarities.scala) - Code the `Collaborative filtering (CF)` (item based) from scratch via Spark 
	- [SparkSQL](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/SparkSQL.scala) - Spark SQL basic
	- [DataFrames](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/DataFrames.scala) - Spark `Dataset`, a important feature when in Spark-2.0/SparkMlib/Spark-stream
	- [PopularMoviesDataSets](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/PopularMoviesDataSets.scala) - Do the popular movie computation again via the `Spark datasets` 
		- [PopularMovies](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/PopularMovies.scala) - Original popular movie approach via Spark RDD
	- [GraphX](https://github.com/yennanliu/utility_Scala/blob/master/src/main/scala/SparkBasic/GraphX.scala) - Spark `GraphX` demo : compute the social network degree for the marvel heros

## Quick Start

<details>
<summary> Quick start manually</summary>

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
</details>

<details>
<summary> Quick start via Docker</summary>

```bash
$ git clone https://github.com/yennanliu/utility_Scala.git
$ cd utility_Scala
$ docker build . -t spark_env
$ docker run  --mount \
type=bind,\
source="$(pwd)"/.,\
target=/utility_Scala \
-i -t spark_env \
/bin/bash

```
</details>

<details>
<summary> Quick start via `Spark-submit`</summary>

```bash
# package the scala saprk scripts
$ sbt package
# list the current classes
$ ls target/scala-2.11/classes
# run ForLoopDemo
$ spark-submit \
  --class ForLoopDemo \
  target/scala-2.11/utilityscala_2.11-1.0.jar 
# run LambdaFuncDemo
$ spark-submit \
  --class LambdaFuncDemo \
  target/scala-2.11/utilityscala_2.11-1.0.jar 
# run spark_basic_demo_4
$ spark-submit \
  --class SparkBasic.spark_basic_demo_4 \
  target/scala-2.11/utilityscala_2.11-1.0.jar
# run MovieSimilarities
$ spark-submit \
  --class SparkBasic.MovieSimilarities \
  target/scala-2.11/utilityscala_2.11-1.0.jar 50 

```

</details>

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

- Scala `Regular Expression`
	- https://www.tutorialspoint.com/scala/scala_regular_expressions.htm
	- https://www.geeksforgeeks.org/regular-expressions-in-scala/

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

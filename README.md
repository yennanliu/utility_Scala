# utility_Scala

## Quick start

```bash
# run scala hello world 
$ git clone https://github.com/yennanliu/utility_Scala.git
$ cd utility_Scala
$ scala HelloWorld.scala 
$ Hello World

# run scala spark hello world
$ sbt package
$ spark-submit \
  --class "SimpleApp" \
  --master local[4] \
  target/scala-2.11/simple-project_2.11-1.0.jar

```

## Ref 
- Scala Tutorial  
	- https://www.javatpoint.com/scala-tutorial
	- https://www.tutorialspoint.com/scala/
	- http://www.runoob.com/scala/scala-basic-syntax.html

- Build Scala Spark project with sbt 
	- http://xd-deng.com/render_html/step_by_step_to_package_spark_app_scala.html


